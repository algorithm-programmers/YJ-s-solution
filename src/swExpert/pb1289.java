package swExpert;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1289. 원재의 메모리 복구하기
public class pb1289 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=t; i++) {
			String orgMem = br.readLine();
			
			
			
			System.out.println("#" + i + " " + getCount(orgMem));
		}
	}
	
	public static int getCount(String orgMem) {
		char[] arr = orgMem.toCharArray();
		int size = arr.length;
		char beforeBit = '0'; // 바뀔때마다 저장
		int answer = 0;
		
		for(int i=0; i<size; i++) {
		
			if(arr[i] != beforeBit) { // 이전 bit와 비교해서 다른 경우에 cnt ++
				if(arr[i] == '1') {
					beforeBit = '1';// bit를 1로 변경하면 그 뒤  bit도 1로 변하므로 1로 비교해야함
				} else {
					beforeBit = '0';
				}
				answer ++;
			}
		}		

		return answer;
	}
}

