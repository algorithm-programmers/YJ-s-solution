package programmers.step1;

// 약수의 합
public class pb12928 {

	public static void main(String[] args) {
		int n = 2;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		if(n == 0) return 0;
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
