package programmers.step2;

public class pb42860 {

//	public int solution(String name) {
//		char[] chArr = name.toCharArray();
//		int sum = 0;
//		int len = name.length();
//		int minMove = name.length() - 1;
//		
//		
//		if(!name.contains("A")) {
//			for(char c : chArr)
//				sum += minDiff(c);
//			
//			return sum += minMove;
//		} else {
//			for(int i=0; i<len; i++) {
//				if(name.charAt(i) != 'A') {
//					int next = i+1;
//					while(next < len && name.charAt(next) == 'A')
//						next ++;
//					int move = 2*i + len - next;
//					
//				}
//			}
//		}
//	}
//	
//	public int minDiff(char c) {
//		int up = c - 'A';
//		int down = 1 + 'Z' - c;
//		return Math.min(up, down);
//	}
}
