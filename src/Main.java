import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Point romy = new Point(sc.nextInt(),sc.nextInt());
		Point jules = new Point(sc.nextInt(), sc.nextInt());
		
		int buildings  = sc.nextInt();
		int count=0;
		for (int i=0;i<buildings;i++) {
			Point[] polygon = new Point[sc.nextInt()];
			for (int j=0;j<polygon.length;j++) {
				Point point = new Point(sc.nextInt(),sc.nextInt()) ;
				polygon[j] = point;
			}
			
			if (isIntercept(romy,jules, polygon)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static boolean isIntercept(Point romy, Point jules, Point[] polygon) {
		// TODO Auto-generated method stub
		for (int i=0;i<polygon.length;i++) {
			if (isIntercept(romy,jules, polygon[i], polygon[(i+1)%polygon.length])) {
				return true;
			}
		}
		return false;
	}

	private static boolean isIntercept(Point p1, Point p2, Point p3, Point p4) {
		// TODO Auto-generated method stub
		return false;
	}

}

class Point {
	int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


