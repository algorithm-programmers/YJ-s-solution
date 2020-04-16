package programmers.step2;

import java.util.PriorityQueue;
import java.util.Queue;

// 더 맵게 
class pb42626 {
     public int solution(int[] scoville, int K) {
	        int answer = 0;
			int arrSize = scoville.length;
			Queue<Integer> pq = new PriorityQueue<Integer>(arrSize);
			
			for(int i=0; i< arrSize; i++){
				pq.add(scoville[i]);
			}
			
			while(pq.size() > 1){
				if(pq.peek() >= K){
					break;
				}else{
					int num1 = pq.poll();
					int num2 = pq.poll();
					int temp = num1 + (num2 * 2);
					pq.offer(temp);
					answer ++;
				}
			}
            if(pq.poll() >= K) {
			return answer;
            }else{
                return -1;
            }
	    }
}