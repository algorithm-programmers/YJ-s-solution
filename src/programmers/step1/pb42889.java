package programmers.step1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// 2019 KAKAO BLIND RECRUITMENT 실패율
public class pb42889 {
	public static void main(String[] args) {
		int N = 5;
		//int N = 4;
		
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		//int[] stages = {4,4,4,4,4};
		solution(N, stages);
	}
	
	//N: 스테이지 수 , stages : 게임을 하는 사용자가 멈춰있는 스테이지 번호 
	 public static int[] solution(int N, int[] stages) {
        HashMap<Double, ArrayList<Integer>> map = new HashMap<>();
        
        double[] challenge = new double[N+1];// 스테이지에 도전한 유저수
        double[] stop = new double[N+1];// 멈춘 스테이지
        
        for(int stage : stages) {
        	if(stage <= N) {
        		stop[stage] ++;
        		
        		for(int i=1; i<=stage; i++) {
        			challenge[i] ++;
        		}
        	} else { // 모든 스테이지를 통과한 유저 : N+1
        		for(int i=1; i<=N; i++) {
        			challenge[i] ++;
        		}
        	}
        }
      //실패율 = STOP/PASS
        for(int i=0; i<N; i++) {
        	double fail = stop[i+1] / challenge[i+1];
        	//System.out.println("i: " + (i+1) + " fail: " + fail);
        	ArrayList<Integer> list = new ArrayList<>();
        	if(map.containsKey(fail)){
        		list = map.get(fail);
        		list.add(i+1);
        	} else {
        		list.add(i+1);
        		map.put(fail, list);
        	}
        }
        ArrayList<Integer> answerList = new ArrayList<>();
        ArrayList<Double> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        list.forEach(k-> {
        	ArrayList<Integer> arr = map.get(k);
        	arr.forEach(val -> {
        		answerList.add(val);
        	});
        });
          
        return answerList.stream().mapToInt(i -> i).toArray();
	 }
	 
}
