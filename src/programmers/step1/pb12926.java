package programmers.step1;

// 12926번 : 시저 암호
public class pb12926 {

	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		System.out.println(solution(s,n));
	}
	
	// 내가 작성한 코드
	/*
	public static String solution(String s, int n) {
		 String answer = "";
		 
		 for(char ch : s.toCharArray()) {
			 if(ch == ' ') {
				 answer += ' ';
			 }
			 else if('a' <= ch && ch <= 'z') {
				 int temp = (char) (ch + n);
				 if(ch + n > 'z') {
					 temp -= 26;
				 } 
				 
				 answer += (char)temp; 
			 } else if('A' <= ch && ch <= 'Z') {
				 int temp = (char) (ch + n);
				 
				 if(ch + n > 'Z') {
					 temp -= 26;
				 }
				 answer += (char)temp;
			 }
		 }
		 System.out.println(answer);
		 return answer;
	}
	*/
	public static String solution(String s, int num) {
		return s.chars().map(c -> {
			int n = num % 26;
			if(Character.isLowerCase(c)) {
				return 'a' + (c - 'a' + n) % 26;
			} else if (Character.isUpperCase(c)) {
				return 'A' + (c - 'A' + n) % 26;
			} else {
				return c;
			}
		}).mapToObj(c -> String.valueOf((char)c))
		.reduce((a,b) -> a + b).orElse("");
	}
}
