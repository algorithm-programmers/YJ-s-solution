package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 반복
public class pb2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=0; i<cnt; i++) {
			solve(br.readLine());
		}
	}
	
	public static void solve(String str) {
		StringBuffer sb = new StringBuffer();
		
		String[] arr = str.split(" ");
		int count = Integer.parseInt(arr[0]);
		char[] ch = arr[1].toCharArray();
		
		for(char c : ch) {
			for(int i=0; i<count; i++) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	} 
}
