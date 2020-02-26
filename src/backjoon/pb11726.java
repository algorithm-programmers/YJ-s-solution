package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2 x n 타일링
public class pb11726 {

	/*
	 * 모든 경우의 수는 오른쪽 타일링을 1*2 타일 2개로 채우던지 2*1 타일 한개로 채우는 방법을 합친 것!
	 * 점화식 : d[n] = (d[n-1] + d[n-2]) % 10007
	 * 10007 로 나눈 나머지 구하는 문제 ~.~ 꼭 문제 자세히 읽기..
	 */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1) {
			System.out.println(1);
			return;
		}
		if(num == 2) {
			System.out.println(2);
			return;
		}
		
		int[] d = new int[num + 1];
		d[1] = 1;
		d[2] = 2;
 		
		for(int i=3; i<=num; i++) {
			d[i] = (d[i-1] + d[i-2]) % 10007;
		}
		System.out.println(d[num]);
	}
}
