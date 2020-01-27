package programmers.step1;

import java.util.Arrays;

// 정수 내림차순으로 배치하기 
public class pb12933 {
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
		
	}
	
	 public static long solution(long n) {
	      char[] ch = String.valueOf(n).toCharArray();
	     
	      Arrays.sort(ch);
	      StringBuilder sb = new StringBuilder();
	      for(char c : ch) {
	        sb.append(c-'0');
	      }
	      
	      long answer = Long.parseLong(sb.reverse().toString());
	      return answer;
	  }
}
