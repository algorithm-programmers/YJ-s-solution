package backjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

// 단어 공부
public class pb1157 {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] ch = input.toUpperCase().toCharArray();
		
		if(ch.length == 1) {
			System.out.println(ch[0]);	
		} else {
			Arrays.sort(ch);
			int idx = 0;
			char temp = ch[0];
			int max = 0;
			char maxChar = 0;
			
			for(int i=0; i<ch.length; i++) {
				if(temp != ch[i]) {
					map.put(temp, i - idx);
					
					if(max < i-idx) {
						max = i-idx;
						maxChar = temp;
					}
					
					idx = i;
					temp = ch[i];
				}
			}
			
			// 마지막 문자열
			map.put(ch[ch.length-1], ch.length - idx);
			if(max < ch.length - idx) {
				max = ch.length - idx;
				maxChar = ch[ch.length-1];
			}
			
			boolean multiple = false;
			
			Set<Character> set = map.keySet();
			for(char c : set) {
				if(map.get(c) == max && c != maxChar) {
					multiple = true;
					break;
				}
			}
			
			if(multiple) {
				System.out.println("?");
			} else {
				System.out.println(maxChar);
			}
		}
		
	
	}
}
