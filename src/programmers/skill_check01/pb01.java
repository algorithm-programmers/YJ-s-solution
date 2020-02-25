package programmers.skill_check01;

/*
문제설명
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
*/
public class pb01 {

	public static void main(String[] args) {
		int n = 3;
		solution(n);
	}
	
	public static String solution(int n) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<n/2; i++) {
			sb.append("수박");
		}
		
		if(n%2 == 1) sb.append("수");
		
		return sb.toString();
	}
	
}
