package programmers.step1;

import java.util.Arrays;

// 12919번 : 서울에서 김서방 찾기

public class pb12919 {

	public static void main(String[] args) {
		String[] s = {"Jane, Kim"};
		solution(s);
	}
	
	/*public static String solution(String[] seoul) {
	      int x = 0;
	      String answer = "";
	      
	      for(String s : seoul) {
	    	  if(s.equals("Kim")) {
	    		  answer = "김서방은 " + x + "에 있다.";
	    		  break;
	    	  }
	    	  x ++;
	      }
	      return answer;
	}*/
	
	public static String solution(String[] seoul) {
	      int x = Arrays.asList(seoul).indexOf("Kim");
	      return "김서방은 " + x + "에 있다";
	}
	
}
