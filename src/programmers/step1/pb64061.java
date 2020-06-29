package programmers.step1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class pb64061 {

	@Test
	public void test() {
		int[][] board = new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = new int[] {1,5,3,5,1,2,1,4};
		assertEquals(4, solution(board, moves));
	}
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        return answer;
    }
}
