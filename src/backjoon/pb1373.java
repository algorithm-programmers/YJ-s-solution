package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2진수 8진수
public class pb1373 {
	
	/* 2진수 3글자 -> 8진수 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] ch = input.toCharArray();
		StringBuffer totalSb = new StringBuffer();
		StringBuffer sb = new StringBuffer();
		int temp = 0;
		for(int i=ch.length-1; i>=0; i--) {
			if(temp == 3) {
				totalSb.append(calculate(sb));
				sb.setLength(0);
				temp = 1;
				sb.append(ch[i]);
			} else {
				sb.append(ch[i]);
				temp ++;
			}	
		}
		if(sb.length() != 0) totalSb.append(calculate(sb));
		
		totalSb.reverse();
		System.out.println(totalSb.toString());
		
	}
	public static int calculate(StringBuffer sb) {
		sb.reverse();
		
		/*
		 * if(sb.length() == 1) { sb.append("00"); } else if(sb.length() == 2) {
		 * sb.append("0"); } else {
		 * 
		 * }
		 */
		
		int sum = 0;
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i) == '1') sum += Math.pow(2, sb.length()-1-i);
		}
		return sum;
	}
}
