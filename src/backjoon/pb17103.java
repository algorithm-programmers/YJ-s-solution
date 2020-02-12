package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 골드바흐 파티션
public class pb17103 {
	private static int[] prime = new int[1000001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		makePrime();// 소수
		int testNum = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testNum; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(sol(num));
		}
	}
	
	public static int sol(int num) {
		int count = 0;

		/* 합친 값이 num 이므로 num의 반까지만 구하면 된다. */
		for(int i=2; i <= num / 2; i++) {
			if(prime[i] == 0 && prime[num - i] == 0) {
				count ++;
			}
		}
		
		return count;
	}
	
	
	public static void makePrime() {
		prime[0] = -1;
		prime[1] = -1;
		for(int i=2; i*i <= 1000000; i++) {
			for(int j=i; i*j<= 1000000; j++) {
				if(prime[i*j] == 0) prime[i*j] = -1;
			}
		}
	}
	
	
}
