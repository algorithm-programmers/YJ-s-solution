package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 에디터
public class pb1406 {
	/*
	 * 예제1
	 	abcd
		3
		P x
		L
		P y

		결과 : abcdyx
	 * 
	 * */
	
	/*
	 * 커서의 왼쪽,오른쪽 구분을 위해 두 개의 stack을 사용
	 * 
	 * */
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		for(char c : arr) {
			left.push(c);
		}
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=0; i<cnt; i++) {
			String order = br.readLine();
			
			switch (order.charAt(0)) {
			/* 커서를 왼쪽으로 이동 */
			case 'L':
				if(!left.empty()) {
					right.push(left.peek());
					left.pop();
				}
				break;
			/* 커서를 오른쪽으로 이동 */
			case 'D':
				if(!right.empty()) {
					left.push(right.peek());
					right.pop();
				}
				break;
			/* 커서 왼쪽에 있는 문자를 삭제(오른쪽 커서의 문자는 그대로 유지) */		
			case 'B':
				if(!left.empty()) {
					left.pop();
				}
				break;
			/* 커서 왼쪽에 문자를 추가 */
			case 'P':
				left.push(order.charAt(2));
				break;
			}
		}
		
		StringBuffer leftSb = new StringBuffer();
		for(char l : left) {
			leftSb.append(l);
		}
		
		/* 오른쪽 stack은 꺼내서 뒤집어줘야한다. */
		StringBuffer rightSb = new StringBuffer();
		for(char r : right) {
			rightSb.append(r);
		}
		rightSb.reverse();
		
		
		System.out.println(leftSb.toString() + rightSb.toString());
	}
	
}
