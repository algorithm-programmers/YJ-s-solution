package programmers.step1;

// 연습문제 > 문자열을 정수로 바꾸기
public class pb12925 {

	public static void main(String args[]) {
		String s = "-3040954";
		System.out.println(solution(s));
	}
	
	// 48 = '0'
	private static int solution(String s) {
		int size = s.length();
		int answer = 0;
		
		if(s.charAt(0) == '-') {
			size -= 1;
		
			for(int i=size-1; i>0; i--) {
				answer -= Math.pow(10,i) * (s.charAt(size-i) - 48);
			}
			answer -= (s.charAt(size) - 48);
		} else if(s.charAt(0) == '+') {
			size -= 1;
			
			for(int i=size-1; i>0; i--) {
				answer += Math.pow(10,i) * (s.charAt(size-i) - 48);
			}
			answer += (s.charAt(size) - 48);
		} else {
			for(int i=size-1; i>0; i--) {
				answer += Math.pow(10,i) * (s.charAt(size-i-1) - 48);
			}
			
			answer += (s.charAt(size-1) - 48);
		}
		return answer;
	}
}
