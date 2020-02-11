package programmers.step1;

// [1차] 다트 게임 
public class pb17682 {

	public static void main(String[] args) {
		//String dartResult = "1S2D*3T";
		//String dartResult = "1D2S#10S";
		//String dartResult = "1D2S0T";
		//String dartResult = "1S*2T*3S";
		//String dartResult = "1D#2S*3S";
		//String dartResult = "1T2D3D#";
		String dartResult = "1D2S3T*";
		solution(dartResult);
	}
	
	public static int solution(String dartResult) {
		String[] str = dartResult.split("");
		int totalScore = 0;
		int curScore = 0; // 현재 점수
		
		int[] arr = new int[4];
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length; i++) {
			// 보너스
			if(str[i].equals("S") || str[i].equals("D") || str[i].equals("T")) {
				// 보너스에 도달했다는 것은 다음 문자열로 넘어왔다는 뜻이므로 idx 증가
				idx ++;
				curScore = 0; // curScore 초기화 (다음 문자열로 넘어왔으므로 새로 시작)
				
				int number = Integer.parseInt(sb.toString());
				sb.setLength(0);
				
				switch (str[i]) { // 보너스 
					case "S":
						curScore = number;
						arr[idx] = curScore;
						break;
					case "D":
						curScore = (int)Math.pow(number, 2);
						arr[idx] = curScore;
						break;
					case "T":
						curScore = (int)Math.pow(number, 3);
						arr[idx] = curScore;
						break;
				}
			} else if (str[i].equals("*") || str[i].equals("#")) {
				switch (str[i]) { // 옵션 
					case "*":
						// 첫번째 경우를 제외하고 이전 idx의 점수를 2배로 올려준다.
						if(idx > 1) arr[idx-1] = 2 * arr[idx-1];
						
						/* 현재 점수도 두배로 올린다. */
						curScore = 2 * curScore;
						arr[idx] = curScore;// 현재 점수도 2배로 인상
						break;
					case "#":
						arr[idx] = (-1) * curScore;
						break;
				}
			} else { // 숫자
				sb.append(str[i]);
			}
		}
	
		for(int i=1; i<4; i++) {
			totalScore += arr[i];
		}
		System.out.println("totalScore: " + totalScore);
		return totalScore;
	}
	
}
