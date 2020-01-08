package programmers.step1;

// 수박수박수박...
public class pb12922 {

	public static void main(String args[]) {
		int n = 3;
		solution(n);
	}

	public static String solution(int n) {
		if(n == 1) {
	        return "수";
	    } else {
	        String answer = "";
	          int half = n / 2;
	        if(n % 2 == 0) {
	          for(int i=0; i<half; i++) {
	              answer += "수박";
	          } 
	        } else {
	        	for(int i=0; i<half; i++) {
	        		answer += "수박";
	        	} 
	            answer += "수";
	        }
	        return answer;
	    }
	}
}
