package dataStructure.ComparableComparator;

// comparable interface로 객체 정렬해보기
// x좌표 증가하는 순으로 정렬, x좌표가 같은 경우 y좌표가 감소하는 순으로 정렬한다.
public class Point implements Comparable<Point>{
	int x, y;
	
	// A.compareToB (A = B : 0, A > B : +1, A > B : -1)  
	@Override
	public int compareTo(Point o) {
		if(this.x > o.x) { // x 오름차순
			System.out.println("this.x: " + this.x);
			System.out.println("o.x" + o.x);
			return 1;
		} else if (this.x == o.x) {
			if(this.y < o.y) {// y 내림차순
				return 1; 
			}
		} 
		return -1;
	}
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
