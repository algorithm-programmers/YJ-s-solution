package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 그룹 단어 체커
public class pb1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for(int i=0; i<cnt; i++) {
			if(groupCheck(br.readLine())) answer ++;
		}
		System.out.println(answer);
	}
	
	public static boolean groupCheck(String str) {
		Set<Character> set = new HashSet<Character>();
		char[] ch = str.toCharArray();
		if(ch.length == 1) return true;
		
		char temp = ch[0];
		set.add(temp);
		
		for(int i=1; i<ch.length; i++) {
			if(ch[i-1] != ch[i]) {
				if(set.contains(ch[i])) return false; // 이미 포함하고 있는 알파벳이면 false
				set.add(ch[i]);
			} 
		}
		return true;
		
	}
}
