import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1038 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner ( System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int x,y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x==1)
		{
			System.out.println("Total: R$ "+df.format(y * 4.00));
		}
		
		if (x==2)
		{
			System.out.println("Total: R$ "+df.format(y * 4.50));
		}
		
		if (x==3)
		{
			System.out.println("Total: R$ "+df.format(y * 5.00));
		}
		
		if (x==4)
		{
			System.out.println("Total: R$ "+df.format(y * 2.00));
		}
		
		if (x==5)
		{
			System.out.println("Total: R$ "+df.format(y * 1.50));
		}
			

	}

}
