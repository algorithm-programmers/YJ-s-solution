package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 숨바꼭질 6 
public class pb17087 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] loc1 = br.readLine().split(" ");
		
		int N = Integer.parseInt(loc1[0]); // 동생 수
		int S = Integer.parseInt(loc1[1]); // 수빈이의 위치
		
		// 공통된 약수의 최대값 구하기 => 최대공약수
		String[] loc2 = br.readLine().split(" ");
		
		// 동생과 수빈이의 거리 차 
		int[] arr = new int[loc2.length];
		for(int i=0; i<arr.length; i++) {
			int max = Math.max(Integer.parseInt(loc2[i]), S);
			int min = Math.min(Integer.parseInt(loc2[i]), S);
			arr[i] = max - min;
		}
		Arrays.sort(arr);// 오름차순으로 정렬
		
		if(arr.length == 1) {
			System.out.println(arr[0]);
			return;
		} else {/* 가장 큰 수를 구하는 것이므로 모든 거리의 최대공약수를 구한다. */
			int temp = gcd(arr[N - 2], arr[N - 1]);
			int idx = N - 2;
			while(idx > 0) {
				temp = gcd(arr[idx - 1], temp);
				idx --;
			}
			System.out.println(temp);
		}
	}
	
	/* 이미 크기순으로 정렬된 배열의 최대공배수를 구하기 때문에 max, min을 따질 필요가 없다. */
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}	
}
