public class Tester {

	public static void main(String[] args){
	
		// Point class test
		
		Point test = new Point(0, 0);
		Point test1 = new Point(-5, 10);
		Point test2 = new Point(4, -6);
		Point test3 = new Point(4.531, 8.79);
		Point test4 = new Point(-3.21, 9.457);

		for(int i = 0; i <= 3; i++){
			if(i == 0)
				test = test1;
			else if(i == 1)
				test = test2;
			else if(i == 2)
				test = test3;
			else
				test = test4;
			System.out.println();
			System.out.println();
			System.out.println("x-cor: " + test.getX());
			System.out.println("y-cor: " + test.getY());
			System.out.println("Redundant equality test: " + test.equals(test));
			System.out.println("Equals test1? " + test.equals(test1));
			System.out.println("Distance to test1: " + test.distanceTo(test1));
		}
	}
}