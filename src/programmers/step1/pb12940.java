package programmers.step1;

public class pb12940 {

	public static void main(String[] args) {
		
	}
	
	public int[] solution(int n, int m) {
	      int[] answer = new int[2];
	      
	      if(m % n == 0) {
	    	  answer[0] = n;
	    	  answer[1] = m;
	    	  return answer;
	      }
	      
	      int max = Math.max(n, m);
	      int min = Math.min(n, m);
	      
	      int g = 1;
	      for(int i=2; i<n; i++) {//n으로는 나누어지지 않고 1은 모든 수가 나누어짐. 2부터 시
	    	  if(max % i == 0) {
	    		  g = i;
	    	  }
	      }
	      answer[0] = g;
	      answer[1] = min * max / g; 
	      
	      return answer;
	  }
}
