package programmers.step1;

import java.util.stream.IntStream;

// 2018 KAKAO BLIND RECRUITMENT [1차] 비밀지도
public class pb17681 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		solution(n, arr1, arr2);
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		// 숫자 비트연산
		IntStream.range(0, n).forEach(idx -> {
			char[] ch = Integer.toBinaryString(arr1[idx] | arr2[idx]).toCharArray();
			StringBuffer sb = new StringBuffer();
			if(ch.length < n) {
				for(int i=0; i<n-ch.length; i++) {
					sb.append(" ");
				}
			}
			
			for(char c : ch) {
				if(c == '1') {
					sb.append("#");
				} else if(c == '0') {
					sb.append(" ");
				}
			}
			System.out.println(sb.toString());
			answer[idx] = sb.toString();
		});
	
		
		return answer;
	}

	
}
