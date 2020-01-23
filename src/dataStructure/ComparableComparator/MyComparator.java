package dataStructure.ComparableComparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Point>{

	@Override
	public int compare(Point o1, Point o2) {
		if(o1.x > o2.x) {// x 오름차순
			System.out.println("o1.x: " + o1.x);
			System.out.println("o2.x: " + o2.x);
			return 1;
		} else if (o1.x == o2.x) {
			if(o1.y < o2.y) {
				return 1;
			}
		}
		return -1;
	}
}
