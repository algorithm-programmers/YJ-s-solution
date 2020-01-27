package programmers.step1;

import java.util.Arrays;

// 서머코딩/윈터코딩 > 예산 
public class pb12982 {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		System.out.println(solution(d, budget));
		//int[] d = {2,2,3,3};
		//int budget = 10;
	}
	
	public static int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		
		for(int i=0; i<d.length; i++) {
			if(budget >= d[i]) {
				answer ++;
				budget-= d[i];
			}
		}
		
		return answer;
	}
}
