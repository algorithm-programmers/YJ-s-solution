package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1,2,3 더하기
public class pb9095 {
	// d[n] = d[n-1] + d[n-2] + d[n-3]
	static int[] d = new int[11];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		go();
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(d[num]);
		}
		
	}
	
	// 11보다 작은 양수이므로 10까지 미리 구해둔다.
	public static void go() {
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		
		for(int i=4; i<=10; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
		}
	}
	
}
