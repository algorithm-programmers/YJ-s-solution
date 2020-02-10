package backjoon;

import java.util.Scanner;

// 팩토리얼 0의 개수
public class pb1676 {

	/* 실제 팩토리얼을 계산하면 너무 오래걸려서 안된다!! -> 시간복잡도가 너무 커짐 */
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int mul = 1;
		
		while(num > 0) {
			mul *= num;
			num --;
		}
		
		String[] str = String.valueOf(mul).split("");
		int count = 0;
		
		for(String s : str) {
			if(Integer.parseInt(s) == 0) count ++;
		}
		System.out.println(count);
	}*/
	
	/*
	 * 2 * 5 = 10 으로 0의 개수를 판단한다.
	 * 팩토리얼에서는 2의 개수는 항상 5의 개수보다 많으므로 5의 개수만 찾으면 0의 개수를 찾을 수 있다.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = sc.nextInt();
		
		/*
		// 500보다 작은 수의 입력이 들어오므로 125까지만 확인한다.
		// 5로 나누기 (5가 한번 들어가는 숫자)
		// 25로 나누기 (5가 두번 들어가는 숫자)
		// 125로 나누기 (5가 세번)
		*/
		for(int i=5; i<=num; i*=i) {
			count += num/i;
		}
		
		System.out.println(count);
	}
}
