import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00000");
		
		double a,b,c,sum,sum1,xsum,ysum,x,y;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		y = ((b * b) - (4 * a * c));
		x = (Math.sqrt(y));
		
		
		sum = ( - b + x );
		xsum = sum/(2*a);
	
		sum1 = ( - b - (x));
		ysum = sum1/(2*a);
		
		if ( (a==0) || (b==0) || (c==0) || (y<0))
		{
			System.out.println("Impossivel calcular");
		}
		
		else
		{
			System.out.println("R1 = "+df.format(xsum));
			System.out.println("R2 = "+df.format(ysum));
		}

	}

}
