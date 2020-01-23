package dataStructure.ComparableComparator;

import java.util.*;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Point> pointList = new ArrayList<>();
		pointList.add(new Point(4,5));
		pointList.add(new Point(2,3));
		pointList.add(new Point(2,1));
		pointList.add(new Point(1,5));
		
		MyComparator comparator = new MyComparator();
		Collections.sort(pointList, comparator);
		pointList.forEach(point -> System.out.println("x: " + point.x  + " y: " + point.y));
	}
}