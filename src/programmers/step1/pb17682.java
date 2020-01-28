package programmers.step1;

import java.util.ArrayList;
// [1차] 다트 게임 
public class pb17682 {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		solution(dartResult);
	}
	
	public static int solution(String dartResult) {
		String[] str = dartResult.split("");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length; i++) {
			if(str[i] == "S" || str[i] == "D" || str[i] == "T") {
				String temp = sb.toString();
				
			} else {
				sb.append(str[i]);
			}
			
		}
		
		
		int answer = 0;
	    return answer;
	}
	
}
