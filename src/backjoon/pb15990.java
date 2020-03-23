package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 1,2,3 더하기
public class pb15990 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) {
			int input = Integer.parseInt(br.readLine());
		}
	}
	public static int solution(int num) {
		if(num == 1) return 1;
		if(num == 2) return 1;
		if(num == 3) return 3;
		
		return 0;
	}
}
