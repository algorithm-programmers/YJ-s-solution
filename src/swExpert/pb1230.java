package swExpert;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// [S/W 문제해결 기본] 8일차 - 암호문3
public class pb1230 {

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
			//String[] orders = br.readLine().split("[I\\D]");
			String[] orders = br.readLine().split(" ");
			
			for(int o=0; o<orders.length; o++) {
				if(orders[o].equals("D")) {
					int x = Integer.parseInt(orders[o+1]);
					int y = Integer.parseInt(orders[o+2]);
					
					// o+3 부터 삭제 -> o+2+y-(o+3)만큼
					for(int cnt=0; cnt < y; cnt++) {
						cryptograms.remove(x);
					}
					
					// 삭제
					//cryptograms.addAll(x, s);
					
					//delete (orders[o+3] ~ orders[o+3+y])
					// x ,y 를 제외해야하므로 +2
					o += 2;
				} else if(orders[o].equals("I")) {
					int x = Integer.parseInt(orders[o+1]);
					int y = Integer.parseInt(orders[o+2]);
					
					ArrayList<String> s = new ArrayList<String>();
					
					// 배열의 orders[o+3] ~ orders[o+3+y-1]
					for(int t=o+3; t<= o+y+2; t++) {
						s.add(orders[t].replace(" ", ""));
					}
	
					// 삽입할 위치에 s 배열리스트 추가
					cryptograms.addAll(x, s);
					//insert (orders[o+3] ~ orders[o+y])
					// x ,y, s길이 만큼 제외해야하므로 +(2 + y)
					o += 2 + y;
				} else if(orders[o].equals("A")) {
					//int x = Integer.parseInt(orders[o+1]);
					int y = Integer.parseInt(orders[o+1]);
					
					ArrayList<String> s = new ArrayList<String>();
					
					// 배열의 orders[o+3] ~ orders[o+3+y-1]
					for(int t=o+2; t<= o+y+1; t++) {
						s.add(orders[t].replace(" ", ""));
					}
	
					// 리스트의 끝에 s 배열리스트 추가
					cryptograms.addAll(s);
					// y, s길이 만큼 제외해야하므로 +(1 + y)
					o += 1 + y;
				}
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
