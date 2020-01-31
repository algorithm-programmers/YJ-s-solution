package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최대공약수와 최소공배수
public class pb2609 {
	
	public static void main(String[] agrs) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] str = input.split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
		
	}
	
	private static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	private static int lcm(int a, int b) {
		int gcd = gcd(a, b);
		return a * b / gcd;
	}
}
