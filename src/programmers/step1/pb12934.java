package programmers.step1;

// 정수 제곱근 판별
public class pb12934 {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
	}
	
	public static long solution(int n) {
		long i = 1;
		while(i*i <= n) {
			if(i*i == n) return (i+1)*(i+1);
			i ++;
		}
		return -1;
 	}
}
