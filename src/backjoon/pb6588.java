package backjoon;

import java.util.Scanner;

// 골드바흐의 추측 --> 에라토스테네스의 체 이용
/*
 * 2보다 큰 모든 짝수는 두 소수의 합으로 표현 가능하다.
 * (위의 문장에 3을 더하면)
 * 5보다 큰 모든 홀수는 세 소수의 합으로 표현 가능하다.
 * 10의 18승 이하에서는 참인 것이 증명되었다.
 */
public class pb6588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			if(num == 0) break;
			sol(num);
		}
	}
	
	public static void sol(int num) {
		int[] arr = new int[num + 1];
		arr[1] = -1; // 1은 소수가 아니다.
		/* 에라토스 테네스의 체 */
		for(int i=2; i*i<=num; i++) {
			for(int j=i; i*j<=num; j++) {
				int temp = i*j;
				if(arr[temp] == 0) arr[temp] = -1;
			}
		}
		
		int min = num;
		int max = 1;
		
		for(int i=2; i<=num; i++) {
			if(arr[i] == 0) {
				min = i;
				int temp = num - min;
				if(arr[temp] == 0) {
					max = temp;
					break;
				}
			}
		}
		
		if(max == 1) {
			System.out.println("Goldbach's conjecture is wrong.");
		} else {
			System.out.println(num + " = " + min + " + " + max);
		}
	}
	
}
