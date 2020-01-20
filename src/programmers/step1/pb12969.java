package programmers.step1;


import java.util.Scanner;

// 직사각형 별찍기

public class pb12969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
        StringBuffer sb = new StringBuffer();
    
        for(int i=0; i<b; i++) {
        	for(int j=0; j<a; j++) {
        		sb.append('*');
        	}
        	sb.append('\n');
        }
      
        System.out.println(sb.toString());
	}
}
