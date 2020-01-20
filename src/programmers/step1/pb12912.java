package programmers.step1;

// 두 정수 사이의 합
public class pb12912 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		solution(a, b);
	}
	
	public static long solution(int a, int b) {
		long sum = 0;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(sum);
		return sum;
	}
}
