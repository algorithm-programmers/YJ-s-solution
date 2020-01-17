package programmers.step1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 12915번 : 문자열 내 마음대로 정렬하기
public class pb12915 {
	
	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		//String[] strings = {"sun", "bed", "car"};
		int n = 1;
		solution(strings, n);
	}
	
	public static String[] solution(String[] strings, int n) {
		int size = strings.length;
		String[] answer = new String[size];
		ArrayList<Character> chArr = new ArrayList<>();
		Map<Character, ArrayList<String>> map = new HashMap<>();
		
		for(int i=0; i<size; i++) {
			ArrayList<String> strList = new ArrayList<>();
			
			char temp = strings[i].charAt(n);
			
			if(map.containsKey(temp)) {
				strList = map.get(temp);
			} else {
				chArr.add(temp);
			}
			
			strList.add(strings[i]);
			map.put(temp, strList);
		}
		
		Collections.sort(chArr);
		int p = 0;
		
		for(char ch : chArr) {
			ArrayList<String> temp = map.get(ch);
			Collections.sort(temp);
			
			for(int j=0; j<temp.size(); j++) {
				answer[p] = temp.get(j);
				p ++;
			}
		}
		

		for(int i =0; i< answer.length; i++) {
			System.out.println(answer[i]);
		}
		return answer;
	}
	
	
}
