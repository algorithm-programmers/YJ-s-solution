package programmers.step1;

// 평균 구하기 
public class pb12944 {

	public static void main(String[] args) {
		
	}
	
	public double solution(int[] arr) {
	      int sum = 0;
	      for(int a : arr) {
	          sum += a;
	      }
	      double answer = (double)sum / (double)arr.length;
	      return answer;
	  }
}
