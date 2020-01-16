package backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 1158번 : 요세푸스 문제
public class pb1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> que = new LinkedList<Integer>(); 
		for(int i=0; i<N; i++) {
			que.offer(i+1);
		}
		String answer = "<";
		
		while(!que.isEmpty()) {
			for(int i=1; i<=K; i++) {
				if(i!= K) {
					que.offer(que.poll());
				} else {
					answer += que.poll() + ", ";
				}
			}	
		}
		answer = answer.substring(0, answer.length() - 2) + ">";
		System.out.println(answer);
	}
	
}
