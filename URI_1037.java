import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0000");
		
		double a;
		
		a = sc.nextDouble();
		
		if (a>=0 && a<=25.0000)
		{
			System.out.println("Intervalo [0,25]");
		}
		
		else if ( (a>=25.00001) && (a<=50.0000000))
		{
			System.out.println("Intervalo (25,50]");
		}
		
		else if ((a>=50.00001) && (a<=75.0000000))
		{
			System.out.println("Intervalo (50,75]");
		}
		 
		else if ( (a>=75.00001) && (a<=100.0000000))
		 {
			 System.out.println("Intervalo (75,100]");
		 }
		 
		 else
		 {
			 System.out.println("Fora de intervalo");
		 }
		

	}

}
