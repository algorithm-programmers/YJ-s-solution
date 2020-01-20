package programmers.step1;

// 이상한 문자 만들기
public class pb12930 {

	public static void main(String[] args) {
		String str = "try hello world"; 
		System.out.println(solution(str));
	}
	
	public static String solution(String s) {
	      StringBuffer sb = new StringBuffer();
	      char[] chArr = s.toCharArray();
	      int temp = 2;
	      
	      for(int i=0; i<chArr.length; i++) {
	    	  if(chArr[i] == ' ') {
	    		  temp = 2;
	    		  sb.append(' ');
	    	  } else {
	    		  if(temp % 2 == 0) {
	    			  sb.append(Character.toUpperCase(chArr[i]));
	    		  } else {
	    			  sb.append(Character.toLowerCase(chArr[i]));
	    		  }
	    		  temp ++;
	    	  }
	      }
	      
	      
	      return sb.toString();
	  }
}
