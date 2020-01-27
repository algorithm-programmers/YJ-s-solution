package programmers.step1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class pb12935 {

	public static void main(String[] args) {
		
	}
	/*
	  if (arr.length <= 1) return new int[]{ -1 };
      int min = Arrays.stream(arr).min().getAsInt();
      return Arrays.stream(arr).filter(i -> i != min).toArray(); 
       */
	public static int[] solution(int[] arr) {
	      if(arr.length == 1) {
	          arr[0] = -1; 
	          return arr;
	      }
	      
	      int[] copy = Arrays.copyOf(arr, arr.length);
	      Arrays.sort(copy);
	      int[] answer = new int[arr.length - 1];
	      int cnt = 0;
	      for(int i = 0; i<arr.length; i++) {
	    	  if(arr[i] != copy[0]) {
	    		  answer[cnt] = arr[i];
	    		  cnt ++;
	    	  }
	      }
	      return answer;
	  }
}
