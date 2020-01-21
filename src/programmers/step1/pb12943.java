package programmers.step1;

// 콜라츠 추측
public class pb12943 {

	public static void main(String[] args) {
		
		
	}
	//long num을 기억!
	public int solution(long num) {
	      int answer = 0;
	      while(answer < 500) {
	          if(num == 1) return answer;
	          
	          if(num % 2 == 0) {
	              num /=2;
	          } else {
	              num = num * 3 + 1;
	          }
	          answer ++;
	      }
	      return -1;
	  }
}
