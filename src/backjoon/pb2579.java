package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계단 오르기
public class pb2579 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] stair = new int[count + 1];
		int[] dp = new int[count + 1];
		
		for(int i=1; i<=count; i++) {
			int temp = Integer.parseInt(br.readLine());
			stair[i] = temp;
		}
		
		dp[1] = stair[1];
		dp[2] = stair[1] + stair[2];
		
		
		for(int idx=3; idx<=count; idx++) {
			dp[idx] = Math.max(stair[idx] + stair[idx-1] + dp[idx - 3], stair[idx] + dp[idx - 2]);
		}
		
		System.out.println(dp[count]);
	}
	
	
	
}
