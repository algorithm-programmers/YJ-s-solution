package swExpert;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1860. 진기의 최고급 붕어빵 
public class pb1860 {

	public static void main(String[] str) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1; t<=T; t++) {
			String answer = "Possible";
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());// 총 인원 
			int M = Integer.parseInt(st.nextToken());// 만드는 시간  
			int K = Integer.parseInt(st.nextToken());// 붕어빵 개수 
			
			int[] timeArr = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++)
				timeArr[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(timeArr);
		
			int lastTime = timeArr[N-1];
			int[] makeCnt = new int[lastTime+1]; // 붕어빵 배열 
			int idx= 1;
			
			while(idx * M <= lastTime) {
				makeCnt[idx * M] = K;
				idx ++;
			}
			
			int prevTime = -1;
			int sum = 0;
			
			for(int i=0; i<N; i++) {
				int time = timeArr[i];
				
				for(int j=prevTime+1; j<= time; j++) {
					sum += makeCnt[j];
					prevTime = time;
				}
				
				if(sum >= 1) {
					sum -= 1;
				} else {
					answer = "Impossible";
				}
			}
			System.out.println("#" + t + " " + answer);
		}
		
	}
	
	
}