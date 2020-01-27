package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 좌표 정렬하기 2
public class pb11651 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		ArrayList<Point> list = new ArrayList<>();
		
		for(int i=0; i<cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			
		}
		
		Collections.sort(list);
		list.forEach(point -> System.out.println(point.x + " " + point.y));
		
	}
}

class Point implements Comparable<Point> {
	int x;
	int y;
	
	@Override
	public int compareTo(Point p) {
		//y 오름차순
		if(this.y > p.y) {
			return 1;
		} else if (this.y == p.y) {
			if(this.x > p.x) {
				return 1;
			}
		}
		return -1;
	}
	
	Point() {}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}