package programmers.step1;

// 연습문제 > 가운데 글자 가져오기
public class pb12903 {
	public static void main(String args[]) {
		//String s = "abcde";
		String s = "qw";
		
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String answer = "";
		
		if(s.length() % 2 == 0) { // 짝수
			answer += Character.toString(s.charAt(s.length()/2 - 1)) + Character.toString(s.charAt(s.length()/2));
		} else {
			answer += Character.toString(s.charAt(s.length()/2));
		}
		
		return answer;
	}
}
