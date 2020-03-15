package swExpert;

import java.util.Scanner;

//1493. 수의 새로운 연산 
public class pb1493 {
	
//	1 1 : 1
//	1 2 : 2 
//	1 3 : 4 
//	1 4 : 7
//	1 5 : 11
//	1 6 : 16
//	y[n] = y[n-1] + (n-1)
//	
//	1 1 : 1
//	2 1 : 3 / 2 2 : 5
//	3 1 : 6 / 3 2 : 
//	4 1 : 10
//	5 1 : 15
//	
//	x[n] = x[n-1] + n
//	
//	1 6 -> 16
//	2 5 -> 17
//	3 4 -> 18 
//	
//	4 3 -> 19
//	6 1 -> 21
	
	// p,q가 10000 보다 작으므로 최대 y 값은 300
	final static int[] y = new int[301];
	
	// x:1 y:? 좌표 y 배열에 저장
	public static void getY() {
		y[1] = 1;
		
		for(int i=2; i<=300; i++) {
			y[i] = y[i-1] + (i-1);
		}
	}
	
	public static void main(String args[]) {
		getY();
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i=1; i<=testCase; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
				
			Coordinate sum = new Coordinate();
			Coordinate cdnP = getCoordinate(p);
			Coordinate cdnQ = getCoordinate(q);
			
			sum.setX(cdnP.getX() + cdnQ.getX());
			sum.setY(cdnP.getY() + cdnQ.getY());
			
			System.out.println("#" + i + " " + getNumber(sum));
		}
	}
	
	// 좌표
	public static Coordinate getCoordinate(int num) {
		Coordinate cdn = new Coordinate();
		int temp = 0;
		int sum = 0;
		
		for(int i=1; i<=300; i++) {
			if(y[i] == num) {
				cdn.setX(1);
				cdn.setY(i);
			
				return cdn;
			} else if(y[i] > num){ // 좌표를 넘어섰을 때
				temp = y[i-1]; // 좌표를 넘어서기 바로 전 좌표(1,y-1) 값
				sum = i;
				
				break;
			}
		}
		
		int diff = num - temp;
		cdn.setX(1 + diff);
		cdn.setY((sum-1) - diff); // Y좌표는 sum - 1 이므로 
		
		return cdn;
	}
	
	public static int getNumber(Coordinate coordinate) {
		int xIdx = coordinate.getX();
		int yIdx = coordinate.getY();
		
		if(xIdx == 1) {
			return y[yIdx];
		} else {
			int sum = xIdx + yIdx;
			int tempY = sum - 1; //(1, tempY)
			int diff = xIdx - 1;
			
			return y[tempY] + diff;
		}
		
	}
	
	
}

class Coordinate {
	private int x = 0;
	private int y = 0;
	
	public Coordinate() {}
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getsum() {
		return this.x + this.y;
	}
}