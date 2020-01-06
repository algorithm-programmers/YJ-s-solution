package step1;

// 연습문제 > 문자열 다루기 기본
public class pb12918 {
	public static void main(String args[]) {
		//String s = "a234";
		String s = "1234";
		System.out.println(solution(s));
	}
	
	public static boolean solution(String s) {
		int size = s.length();
		if(size == 4 || size == 6) {
			for(int i=0; i<size; i++) {
				if(s.charAt(i) >= 'a') {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
}
