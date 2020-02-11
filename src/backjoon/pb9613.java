package backjoon;

import java.util.Scanner;

// GCD 합
public class pb9613 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testNum = Integer.parseInt(sc.nextLine());
		long sum = 0;
		
		for(int count=0; count<testNum; count++) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			sum = 0;
			
			if(arr.length != 1) {
				for(int i=1; i<arr.length - 1; i++) {
					for(int j=i+1; j<arr.length; j++) {
						sum += gcd(Integer.parseInt(arr[i]), Integer.parseInt(arr[j]));
					}
				}
				System.out.println(sum);
			}
		}
	}
	
	public static int gcd(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		while(min != 0) {
			int temp = max;
			max = min;
			min = temp % min;
		}
		
		return max;
	}
}
