package programmers.step1;

// 소수찾
public class pb12921 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int[] num = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			if(num[i] == 0) {
				for(int j=2; i*j<=n; j++) {
					num[i*j] = -1;
				}
			}
		}
		
		int count = 0;
		for(int i=2; i<=n; i++) {
			if(num[i] == 0) {
				count ++;
				System.out.println(i);
			}
		}
		return count;
	}
}
