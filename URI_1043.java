import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		DecimalFormat df= new DecimalFormat ("0.0");
		
		double a,b,c,P,A;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		P = (a+b+c);
		A = ( ( (a+b) /2 )*c);
		
		
		if ( ( (a+b)>c ) && ( (b+c)>a  ) && ( (c+a)>b ) ) 
		{
			System.out.println("Perimetro = "+df.format(P));
		}
		
		else  
		{
			System.out.println("Area = "+df.format(A));
		}

	}

}
