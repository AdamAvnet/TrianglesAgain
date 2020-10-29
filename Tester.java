public class Tester {

	public static void main(String[] args){
	
		// Point class test
		
		Point Ptest = new Point(0, 0);
		Point Ptest1 = new Point(-5, 10);
		Point Ptest2 = new Point(4, -6);
		Point Ptest3 = new Point(4.531, 8.79);
		Point Ptest4 = new Point(-3.21, 9.457);

		for(int i = 0; i <= 3; i++){
			if(i == 0)
				Ptest = Ptest1;
			else if(i == 1)
				Ptest = Ptest2;
			else if(i == 2)
				Ptest = Ptest3;
			else
				Ptest = Ptest4;
			System.out.println();
			System.out.println();
			System.out.println("x-cor: " + Ptest.getX());
			System.out.println("y-cor: " + Ptest.getY());
			System.out.println("Redundant equality test: " + Ptest.equals(Ptest));
			System.out.println("Equals Ptest1? " + Ptest.equals(Ptest1));
			System.out.println("Distance to Ptest1: " + Ptest.distanceTo(Ptest1));
		}
	

		// Triangle class test
		
		Point p1 = new Point(0, 4);
		Point p2 = new Point(4, 0);
		Point p3 = new Point(0, 0);
		Triangle Ttest = new Triangle(0, 0, 0, 0, 0, 0);
		Triangle Ttest1 = new Triangle(p1, p2, p3);
		Triangle Ttest2 = new Triangle(2, 5, 10, 5, 6, 11.9282);
		Triangle Ttest3 = new Triangle(0.34, 1.32, 1.34, 1.32, 1.34, 2.32);
		Triangle Ttest4 = new Triangle(2.1, 8.012, 3.1415, 2.1818, 5.437, 7.549);

		for(int i = 0; i <= 3; i++){
			if(i == 0)
				Ttest = Ttest1;
			else if(i == 1)
				Ttest = Ttest2;
			else if(i == 2)
				Ttest = Ttest3;
			else
				Ttest = Ttest4;
			System.out.println();
			System.out.println();
			
			System.out.println("Triangle: " + Ttest);
			System.out.println("Perimeter: " + Ttest.getPerimeter());
			System.out.println("Area: " + Ttest.getArea());
			System.out.println("Class: " + Ttest.classify());
			Ttest.setVertex(1, p1);
			System.out.println("Modified Triangle: " + Ttest);
		}
	}
}