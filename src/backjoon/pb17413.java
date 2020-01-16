package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//17413번: 단어 뒤집기 2
public class pb17413 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> stack = new Stack<>();
		Queue<Character> que = new LinkedList<Character>();
		
		try {
			String inputStr = br.readLine();
			for(int i=0; i<inputStr.length(); i++) {
				if(inputStr.charAt(i) == '<') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					que.offer(inputStr.charAt(i));
				} else if(inputStr.charAt(i) == '>') {
					que.offer(inputStr.charAt(i));
					
					while(!que.isEmpty()) {
						sb.append(que.poll());
					}
				} else if(inputStr.charAt(i) == ' ') {
					if(!stack.isEmpty()) {
						while(!stack.isEmpty()) {
							sb.append(stack.pop());
						}	
						sb.append(inputStr.charAt(i));
					}
					
					if(!que.isEmpty()) {
						que.offer(inputStr.charAt(i));
					}
				} else {
					if(!que.isEmpty()) {
						que.offer(inputStr.charAt(i));
					} else {
						stack.push(inputStr.charAt(i));
					}
				}
			}
			
			while(!que.isEmpty()) {
				sb.append(que.poll());
			}
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
