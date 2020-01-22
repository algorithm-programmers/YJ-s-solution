package programmers.step1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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
        int[] answer = new int[N];
        HashMap<Integer, Double> map = new HashMap<>();
        
        double[] pass = new double[N+1];// 스테이지를 통과한 유저수
        double[] stop = new double[N+1];// 멈춘 스테이지
        
        for(int stage : stages) {
        	if(stage <= N) {
        		stop[stage] ++;
        		
        		for(int i=1; i<stage; i++) {
        			pass[i] ++;
        		}
        	} else { // 모든 스테이지를 통과한 유저 : N+1
        		for(int i=1; i<=N; i++) {
        			pass[i] ++;
        		}
        	}
        }
        
        /*for(int i=0; i<N; i++) {
        	System.out.println("pass: " + pass[i+1]);
        	System.out.println("stop: " + stop[i+1]);
        }*/
        
        //실패율 = STOP/PASS
        for(int i=0; i<N; i++) {
        	System.out.println(stop[i+1]);
        	System.out.println(pass[i+1]);
        	double fail = stop[i+1] / pass[i+1];
        	System.out.println(fail);
        	map.put(i, fail);
        }
        
        // value 기준으로 정렬 (comparator 이용)
        Iterator it = sortByValue(map).iterator();
       
        System.out.println("------------sort 후 -------------");

        while(it.hasNext()) {

            int temp = (int) it.next();

           // System.out.println(temp + " = " + map.get(temp));


        }
        
        //스테이지 도달 못하면 실패율 0 
        
        return answer;
    }
	 
	// value로 sort!
	public static List sortByValue(HashMap<Integer, Double> map) {
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(map.keySet());
		
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				
				return ((Comparable)v2).compareTo(v1);
			}
		});
		
		Collections.reverse(list);
		return list;
	}
	
}
