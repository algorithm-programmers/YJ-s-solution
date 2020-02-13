package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 뒤집기
public class pb9093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) {
			String input = br.readLine();
			sol(input);
		}
	}
	
	public static String sol(String input) {
		String[] str = input.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<str.length - 1; i++) {
			sb.append(reverseWord(str[i]) + ' ');
		}
		sb.append(reverseWord(str[str.length-1]));
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	public static String reverseWord(String str) {
		StringBuffer sb = new StringBuffer();
		
		for(int i=str.length() - 1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}