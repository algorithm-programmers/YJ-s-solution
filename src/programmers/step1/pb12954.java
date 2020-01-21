package programmers.step1;

// x만큼 간격이 있는 n개의 숫자
public class pb12954 {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		solution(x, n);
	}
	
	public static long[] solution(long x, int n) {
		long[] answer = new long[n];
	    // 등차수열 a +(n-1)d
		for(int i=1; i<=n; i++) {
			answer[i-1] = i*x;
			System.out.println(answer[i-1]);
		}
		return answer;
	}
}
