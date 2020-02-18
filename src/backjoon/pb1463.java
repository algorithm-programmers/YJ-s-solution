package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1로 만들기
public class pb1463 {
	static int d[] = new int[1000001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		 System.err.println(go(num));
	}
	/* top - down */
/*	public static int go(int n) {
		if(n == 1) return 0;
		if(d[n] > 0) return d[n];
		
		d[n] = go(n-1) + 1;
		
		if(n%2 == 0) {
			int temp = go(n/2) + 1;
			if(d[n] > temp) d[n] = temp; // 계속 비교해서 더 작은 수를  d[n]에 넣는다.
		}
		
		if(n%3 == 0) {
			int temp = go(n/3) + 1;
			if(d[n] > temp) d[n] = temp;
		}
		
		return d[n];
	}
*/
	
	/* bottom - up */
	public static int go(int n) {
		d[1] = 0;

		for(int i=2; i<=n; i++) {
			d[i] = d[i-1] + 1;
			
			if(i%2 == 0 && d[i] > d[i/2] + 1) {
				d[i] = d[i/2] + 1;
			}
			
			if(i%3 == 0 && d[i] > d[i/3] + 1) {
				d[i] = d[i/3] + 1;
			}
		}
		
		return d[n];
	}
	
}
