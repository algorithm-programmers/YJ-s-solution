package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 합
public class pb11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		int sum = 0;
		for(char c : arr) {
			sum += c - '0';
		}
		System.out.println(sum);
		
	}
}
