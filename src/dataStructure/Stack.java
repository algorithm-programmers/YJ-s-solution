package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* java 로 스택 구현 */
public class Stack {
	static int[] arr = new int[10000];
	static int arr_size = 0;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		while(count > 0) {
			count --;
			
			String str = br.readLine();
			String[] str_arr = str.split(" ");
			
			if(str_arr.length == 2) { // push
				push(Integer.parseInt(str_arr[1]));
			} else {
				if(str.equals("pop")) {
					System.out.println(pop());
				} else if(str.equals("size")) {
					System.out.println(size());
				} else if(str.equals("empty")) {
					System.out.println(empty());
				} else if(str.equals("top")) {
					System.out.println(top());
				}
			}
		}	
	}
	

	public static void push(int x) {
		arr[arr_size] = x;
		arr_size ++;
	}
	
	public static int pop() {
		if(empty() == 1) return -1;
		
		arr_size --;
		return arr[arr_size];
	}
	
	public static int size() {
		return arr_size;
	}
	
	public static int empty() {
		if(arr_size == 0) return 1;
		return 0;
	}
	
	public static int top() {
		if(empty() == 1) return -1;
		return arr[arr_size - 1];
	}
	
}
