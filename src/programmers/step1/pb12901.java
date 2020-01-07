package programmers.step1;

public class pb12901 {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		System.out.println(solution(a,b));
	}
	
	// 2016년 1월 1일 : 금 (week[5])
	public static String solution(int a, int b) {
		String[] week = {"SUN", "MON","TUE","WED","THU","FRI","SAT"};
		int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		int day_sum = b;
		
		for(int i=1; i<a; i++) {
			day_sum += month[i];
		}
		
		int remain = (day_sum + 4) % 7;
		
		return week[remain];
	}
}
