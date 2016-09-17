public class testP3D {
	public static void main(String[] args) {
		Point3D point1 = new Point3D(1.5, 3.5, 10.1);
		Point3D point2 = new Point3D(2.4, 4.1, 6.6);

		double dist = distance(point1, point2);
		double distL1 = distanceL1(point1, point2);

		System.out.println("Euclidean distance: "+dist);
		System.out.println("L1 distance: " +distL1);
	}

	public static double distance(Point3D a, Point3D b) {
		double d = Math.sqrt(Math.pow((a.x - b.x),2)+(Math.pow((a.y - b.y),2))+(Math.pow((a.z - b.z),2)));
		return d;
	}

	public static double distanceL1(Point3D a, Point3D b) {
		double d = Math.abs(a.x - b.x) + Math.abs(a.y - b.y) + Math.abs(a.z - b.z);
		return d;
	}
}
