import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		
		double a,b,c,x,y=0,z=0;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		x = Math.max(a,Math.max(b, c));
		
		if(x==a)
		{
			y = Math.max(b, c);
			z = Math.min(b, c);
		}
		
		if (x==b)
		{
			y = Math.max(a, c);
			z = Math.min(a, c);
		}
		
		if (x==c)
		{
			y = Math.max(b, a);
			z = Math.min(b, a);
		}
		
		
		if (x >= (y + z) )
		{
			System.out.println("NAO FORMA TRIANGULO");
		}
		
		else 
			{
			if ( ( (x*x) > ( (y*y) + (z*z) ) ) )
			
		{
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		
		if ( ( (x*x) == ( (y*y) + (z*z) ) ) )
		{
			System.out.println("TRIANGULO RETANGULO");
		}
		
			
		if ( ( (x*x) < ( (y*y) + (z*z) ) ) )
		{
			System.out.println("TRIANGULO ACUTANGULO");
		}
		
		if ( (x== y) && (x==z) )
		{
			System.out.println("TRIANGULO EQUILATERO");
		}
		
		if ( ( (x==y) && (x!=z) ) || ( (x==z) && ( x!=y) ) || ( (y==z) && (y!=x) ) )
		{
			System.out.println("TRIANGULO ISOSCELES");
		}
		
			}
		
		
	} 

}
