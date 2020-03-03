package swExpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// [S/W 문제해결 기본] 8일차 - 암호문1
public class pb1228 {

	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int testCase=1; testCase<=10; testCase++) {
			
			// input 1 : 원본 암호문의 길이 N
			int N = Integer.parseInt(br.readLine());
		
			// input 2 : 원본 암호문 (공백으로 잘라 배열을 만든 후 공백 제거)
			String[] cryptStr = br.readLine().split(" ");
			ArrayList<String> cryptograms = new ArrayList<String>(Arrays.asList(cryptStr));
			
			// input 3 : 명령어 개수
			int orderCnt = Integer.parseInt(br.readLine());
			
			// input 4 : 명령어
			String[] orders = br.readLine().split("I");
			
			// I(삽입) x, y, s
			for(int idx=1; idx<=orderCnt; idx++) {
				String order = orders[idx].trim();
				String[] orderStr = order.split(" ");
				
				int x = Integer.parseInt(orderStr[0]); // 삽입할 위치
				int y = Integer.parseInt(orderStr[1]); // 삽입할 문자열의 개수
				
				ArrayList<String> s = new ArrayList<String>();
				// 배열의 2번째부터 s 시작됨 
				for(int t=2; t< orderStr.length; t++) {
					s.add(orderStr[t].replace(" ", ""));
				}

				// 삽입할 위치에 s 배열리스트 추가
				cryptograms.addAll(x, s);
			}
			
			StringBuffer sb = new StringBuffer();
			sb.append("#" + testCase);
			
			for(int cnt=0; cnt<10; cnt++) {
				sb.append(" " + cryptograms.get(cnt));
			}
			
			System.out.println(sb.toString());
		}
	}
	
}
