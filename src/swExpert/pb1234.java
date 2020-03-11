package swExpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// 1234.[S/W 문제해결 기본] 10일차 - 비밀번호
public class pb1234 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		

		
		for(int i=1; i<=10; i++) {
			String[] str = br.readLine().split(" ");
			sb.append("#" + i + " " + solution(str[1]) + "\n");
		}
		
		System.out.println(sb.toString());
	}
	
	public static String solution(String input) {
		String[] arr = input.split("");
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		
		int idx = 0;
		while(idx < list.size() - 1) {
			if(list.get(idx).equals(list.get(idx + 1))) {
				list.remove(idx);
				list.remove(idx); // 한번 지우고 나면 idx 감소하므로
				if(idx > 0) idx --;
				//System.out.println(list.toString());
			} else {
				idx ++;
			}
		}
		StringBuffer sb = new StringBuffer();
		
		for(String str : list) {
			sb.append(str);
		}
		
		return sb.toString();
		
	}
}
