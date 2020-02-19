package programmers.step2;

// 카펫
public class pb42842 {
	public static void main(String[] args) {
		solution(10,2);
	}
	
	public static int[] solution(int brown, int red) {
		int x = 0;
		int y = 0;
		// red 블럭 약수 집합
		for(int i=1; i*i <= red; i++) {
			if(red % i == 0) {
				y = i;
				x = red / i; // 가로는 세로보다 크거나 같다.
				
				int temp = 2 * x + 2 * y + 4;
				if(temp == brown) break;
			}
		}
		// 전체 블럭은 빨간색 블럭보다 가로, 세로 2 만큼 더 길다.
		int[] answer = {x+2, y+2};
		return answer;
    }
}
