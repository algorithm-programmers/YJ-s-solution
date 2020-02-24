package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2 x n 타일링
public class pb11726 {

	// 방법은 마지막 끝을 세로로 하나 아니면 가로로 두개 놓는 방법 둘 중 하나
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		// 2 * (n-1) / 2 * (n-2)
		System.out.println(sol(num)); 
		
 	}
	
	// top-down
	public static int sol(int num) {
		if(num == 1) {
			return 1;
		} else if(num == 2) {
			return 2;
		} else {
			return sol(num - 1) + sol(num - 2);
		}
	}
}
