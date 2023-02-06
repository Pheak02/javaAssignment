import java.util.*; // for Comparator and Random

public class Ch3_Exercise4 { // this program will create a Point class and then implement two different ways
								// to
	public static void main(String[] args) // class that implements Comparator which will be used by sort
	{
		Random g = new Random();
		Point[] points = new Point[10]; // we will create 10 random points
		for (int i = 0; i < 10; i++)
			points[i] = new Point(g.nextInt(10), g.nextInt(10));
		Arrays.sort(points); // sort the array using Point's compareTo, which sorts x-coordinates and

		System.out.println("Here is 10 random points: ");

		for (int i = 0; i < 10; i++) // if equal, uses the y-coordinates to break the tie
			System.out.println(points[i]); // print them out
		System.out.println("\n\n");
		Arrays.sort(points, new CompareY()); // now sort the array using CompareY as Comparator, this class sorts

		System.out.println("Here is point after sort on y coordinate: ");

		for (int i = 0; i < 10; i++) // on y-coordinates first and then x-coordinates in a tie
			System.out.println(points[i]); // print them out
	}

	private static class Point implements Comparable // our Point class contains a compareTo method
	{
		private int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public int compareTo(Object o) // because we did not implement Comparable<Point> we receive an Object
		{
			Point p = (Point) o; // so we have to cast o as a Point to pass it messages
			if (x != p.getX())
				return x - p.getX(); // if x's are not the same, return their difference
			else
				return y - p.getY(); // and if x's are the same, return the difference in y's
		}

		public String toString() {
			return x + "," + y; // so we can output it in main easily using println
		}
	}

	private static class CompareY implements Comparator<Point> // here we implement a separate means to compare two
	{ // Points so that we can see how a Comparator is used
		public boolean equals(Point p1) // with Arrays.sort
		{
			return false; // note: since CompareY does not store a Point, there is nothing to compare p1
							// to
		} // so it returns false, this is a useless method but needed to implement
			// Comparator

		public int compare(Point p1, Point p2) // since we are implementing Comparator<Point> no casting needed
		{
			if (p1.getY() != p2.getY())
				return p1.getY() - p2.getY(); // use the same strategy for comparing two Points
			else
				return p1.getX() - p2.getX(); // as compareTo except compare y's first
		}
	}
}