package pac3;

public class exc3 {
	public static void main(String[] args) {
		double a = 6   ;
		double b = 5 ;
		double c = 1 ;
		
		double d = b*b-4*a*c ;
		System.out.println("D = " + d);
		if (d > 0) {
			double x1 = (-b+(Math.sqrt(d)))/2*a;
			double x2 = (-b-(Math.sqrt(d)))/2*a;
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		if (d < 0) {
			System.out.println(" коренів нема ");
		}
		
		if (d==0) {
			double x = -b/(2*a);
			System.out.println("x = " + x);
			
		}
		
		
		
	}
}
