package programmers.step1;

// 자릿수 더하기
public class pb12931 {

	public static void main(String[] args) {
		int n = 126;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		 int sum = 0;
	        int temp = 0;
	        
	        while(n >= 10) {
	            if(n == 100000000) {
	                return 1;
	            } else if (10000000 <= n && n < 100000000) {
	                temp = n / 10000000;
	                sum += temp;
	                n -= (temp*10000000);
	            } else if (1000000 <= n && n < 10000000) {
	                temp = n / 1000000;
	                sum += temp;
	               n -= (temp*1000000);
	            } else if (100000 <= n && n < 1000000) {
	                temp = n / 100000;
	                sum += temp;
	               n -= (temp*100000);
	            } else if (10000 <= n && n < 100000) {
	                temp = n / 10000;
	                sum += temp;
	                n -= (temp*10000);
	            } else if (1000 <= n && n < 10000) {
	                temp = n / 1000;
	                sum += temp;
	               n -= (temp*1000);
	            } else if (100 <= n && n < 1000) {
	                temp = n / 100;
	                sum += temp;
	              n -= (temp*100);
	            } else if (10 <= n && n < 100) {
	                temp = n / 10;
	                sum += temp;
	                n -= (temp*10);
	            }
	        }
	        sum += n;
	        return sum;
	}
}
