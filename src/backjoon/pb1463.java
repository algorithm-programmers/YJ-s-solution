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
		System.out.println(d[num]);
	}
	
	
	
	
	
	/* top - down */
//	public static int go(int n) {
//		if(n == 1) {
//			return 0;
//		}
//		
//		d[n] = go(n-1) + 1;
//		
//		if(n % 2 == 0) {
//			d[n] = Math.max(go(n/2) + 1, d[n]);
//		}
//		
//		if(n % 3 == 0) {
//			d[n] = Math.max(go(n/3) + 1, d[n]);
//		}
//		
//		return d[n];
//	}
	
	/* bottom - up */
	public static int go(int n) {
		
		if(n == 1) {
			return 0;
		}
		
		for(int i=2; i<=n; i++) {
			d[i] = d[i-1] + 1;
			
			if(i % 2 == 0) {
				d[i] = Math.max(d[n/2] + 1, d[i]);
			}
			
			if(i % 3 == 0) {
				d[i] = Math.max(d[n/3] + 1, d[i]);
			}
		}
		return d[n];
	}
	
}
