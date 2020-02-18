package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오큰수
public class pb17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[n];
		String[] arr = br.readLine().split(" ");
		for(int i=0;i<n; i++) {
			input[i] = Integer.parseInt(arr[i]);
		}
	
		StringBuffer sb = new StringBuffer();
		int idx = 0;
		
		while(idx < n-1) {
			boolean check = false;
			for(int i=idx+1; i<n; i++) {
				if(input[idx] < input[i]) {
					check = true;
					sb.append(input[i]);
					break;
				}
			}
			if(check == false) sb.append(-1);
			idx ++;
			sb.append(" ");
		}
		sb.append("-1");
		
		System.out.println(sb.toString());
		
	}
	
	
}
