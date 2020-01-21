package programmers.step1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// [2020카카오공채] 문자열 압축
public class pb60057 {
	public static void main(String args[]) {
		//String str = "aabbaccc";
		//	String str = "ababcdcdababcdcd";
//		String str = "abcabcdede";
		String str = "abcabcabcabcdededededede";
		//String str = "xababcdcdababcdcd";
		solution(str);
	
	}
	
	public static int solution(String str) {
		int len = str.length();
		
 		for(int i=1; i<=str.length()/2; i++) {
			Queue<String> que = new LinkedList<String>();
		
			int j = 1;
			while(i * j <= str.length()) {
				que.offer(str.substring((j-1)*i, (j-1)*i + i));
				j ++;
			}
			
			if(i*j != str.length()) {
				que.offer(str.substring(i*(j-1)));
			}
			
			int count = 1;
			StringBuffer sb = new StringBuffer();
			
			while(!que.isEmpty()) {
				String poll = que.poll();
				String peek = que.peek();
				
				if(poll.equals(peek)) { // 앞, 뒤 같을 때
					count ++;
				} else { // 앞, 뒤 다를 때
					if(count != 1) {
						sb.append(count + poll);
						count = 1;
					} else {
						sb.append(poll);
					}
				}
				if(que.size() == 1 && count != 1) {
					sb.append(count + peek);
					que.poll();
				}
			}
			
			System.out.println(sb.toString());
			
			if(sb.length() < len) {
				len = sb.length();
			}
		}
 		System.out.println("가장 짧은 길이: " + len);
		return len;
	}

}
