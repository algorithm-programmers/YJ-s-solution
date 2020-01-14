package programmers.step1;

import java.util.ArrayList;
import java.util.Arrays;

// 나누어 떨어지느 숫자 배
public class pb12910 {

	public static void main(String[] args) {
		
	}
	
	public static int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length;i ++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		if(list.size() == 0) {
			int[] answer = {-1};
			return answer;
		} else {
			int[] answer = new int[list.size()];
			
			for(int i=0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
			Arrays.sort(answer);
			return answer;
		}
	}
}
