package dataStructure.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	public static void main(String[] args) {
		List<Point> pointList = new ArrayList<>();
		pointList.add(new Point(4,5));
		pointList.add(new Point(2,3));
		pointList.add(new Point(2,1));
		pointList.add(new Point(1,5));
		Collections.sort(pointList);
		
		pointList.forEach(point -> System.out.println("x: " + point.x  + " y: " + point.y));
	}
}
