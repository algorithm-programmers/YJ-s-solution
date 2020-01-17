package programmers.step1;

//12916번 : 문자열 내 p와 y의 개수
public class pb12916 {
	public static void main(String[] args) {
		String s = "";
		solution(s);
	}
	
	static boolean solution(String s) {
        int yCnt = 0;
        int pCnt = 0;
        
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == 'P' || s.charAt(i) == 'p') {
        		pCnt ++;
        	} else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y') {
        		yCnt ++;
        	}
        }

        if(yCnt == pCnt) return true;
        
        return false;
    }
}
