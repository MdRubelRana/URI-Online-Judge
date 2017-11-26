import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		double a;
		int x=0,i;
		
		
		for ( i=0;i<6;i++)
		{
			a = sc.nextDouble();
			
			if ( a>0)
			{
				x++;
			}
			
		}
		System.out.println(x+" valores positivos");
		
		
	}

}
