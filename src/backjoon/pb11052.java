package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 카드 구매하기
public class pb11052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] arr = new int[count+1];
		int[] d = new int[count+1];
		
		for(int i=1; i<=count; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		for(int i=1; i<=count; i++) {
			for(int j=1; j<=i; j++) {
				d[i] = Math.max(d[i], d[i-j] + arr[j]);
			}
		}
	}
}
