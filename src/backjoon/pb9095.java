package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1,2,3 더하기
public class pb9095 {
	static int[] d = new int[12];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) {
			go(Integer.parseInt(br.readLine()));
		}
	}
	
	
	/* bottom - up */
	public static int go(int num) {
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
				
		for(int i=4; i<=11; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
		}
		
		//System.out.println(d[num]);
		return d[num];
	}
}
