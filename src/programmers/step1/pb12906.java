package programmers.step1;

import java.util.ArrayList;
import java.util.Arrays;

// 연습문제 > 같은 숫자는 싫어
public class pb12906 {
	
	public static void main(String args[]) {
		int[] arr = {1,1,3,3,0,1,1};
		//int[] arr = {4,4,4,3,3};
		
		solution(arr);
	}
	
	private static int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i-1];
			
			if(temp != arr[i]) {
				list.add(arr[i]);
				
			}
		}
		
		int[] answer = new int[list.size()];
		int idx = 0;
		
		for(int a : list) {
			answer[idx] = a;
			idx ++;
		}
		return answer;
	}

}
