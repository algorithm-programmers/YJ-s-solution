package backjoon;

import java.util.Scanner;

// 소수 구하기 : 에라토스테네스의 체
public class pb1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[] arr = new int[N+1];
		
		/* N의 가장 큰 소수 i는 N의 제곱근이므로 조건을 i*i<=N 으로 세운다.
		 * 소수 : 1과 자신이외의 다른 수로 나누어지지 않는 수
		 * 즉, j를 i씩 증가시켜서 곱해지는 수는 소수가 아니므로 해당 값에 -1을 넣어준다.
		 */
		for(int i=2; i*i<=N; i++) {
			for(int j=i; i*j<=N; j++) {
				if(arr[i*j] == 0) {
					arr[i*j] = -1;
				}
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(arr[i] == 0 && i != 1) { // 1은 소수가 아니므로 제외시킨다.
				System.out.println(i);	
			}
		}
	}
}
