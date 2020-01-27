package programmers.step1;

// 하샤드 수 
public class pb12947 {
	
	public static void main(String[] args) {
		int x = 10;
		System.out.println(solution(x));
	}
	
	public static boolean solution(int x) {
	      char[] ch = String.valueOf(x).toCharArray();
	      int sum = 0;
	      for(char c : ch) {
	          sum += c - '0';
	      }
	      if(x % sum == 0) return true;
	      return false;
	  }
	
}
