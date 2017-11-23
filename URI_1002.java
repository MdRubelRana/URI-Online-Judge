import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1002 {

	public static void main(String[] args) {
		Scanner abc = new Scanner (System.in);
		DecimalFormat d = new DecimalFormat ("0.0000");
		double A,R,PI=3.14159;
		
		System.out.println("Enter:");
		R = abc.nextDouble();
		
		A = PI * (R*R);
		System.out.println("A="+d.format(A));
		
		
	}

}
