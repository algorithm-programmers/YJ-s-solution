package programmers.step1;

// 자연수 뒤집어 배열로 만들기
public class pb12932 {

	public static void main(String[] args) {
		long n = 12345;
		solution(n);
	}
	
	 public static int[] solution(long n) {
	      String str = String.valueOf(n);
	      int[] answer = new int[str.length()];
	      char[] ch = str.toCharArray();
	      
	      for(int i = ch.length -1; i>=0; i--) {
	    	  answer[ch.length - i -1] = ch[i] - '0';
	    	  //System.out.println(answer[ch.length - i -1]);
	      }
	      
	      
	      return answer;
	  }
}
