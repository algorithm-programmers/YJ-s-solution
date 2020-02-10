package backjoon;

import java.util.Scanner;

// 조합 0의 개수
public class pb2004 {

	/*
	 * 2 * 5 = 10 으로 0의 개수를 판단한다.
	 * 조합에서는 2의 개수가 5의 개수보다 작을 수 있으므로 2,5 모두 확인한다.
	 * nCm => n!/ (n-m)!m!
	 * n! 은 + , 나눠주는 (n-m)!과 m!은 -
	 * 2와 5의 개수 중 작은 개수가 10의 개수와 같다.
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		int two = 0;
		int five = 0;
		
		for(long i=2; i<=n; i*=2) {
			two += n/i;
		}
		for(long i=2; i<=(n-m); i*=2) {
			two -= (n-m)/i;
		}
		for(long i=2; i<=m; i*=2) {
			two -= m/i;
		}
		
		for(long i=5; i<=n; i*=5) {
			five += n/i;
		}
		for(long i=5; i<=(n-m); i*=5) {
			five -= (n-m)/i;
		}
		for(long i=5; i<=m; i*=5) {
			five -= m/i;
		}
		
		System.out.println(Math.min(two, five));
	}
}
