package programmers.step1;

public class pb12940 {

	public static void main(String[] args) {
		
	}
	
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int ori_n = n;
		int ori_m = m;
		while(m > 0) {
			int tmp = m;
			m = n % m;
			n = tmp;
		}
		answer[0] = n;
		answer[1] = ori_m * ori_n / n; 
		
		return answer;
	  }
}
