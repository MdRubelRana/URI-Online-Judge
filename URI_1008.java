import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		int a,b;
		double c,d;
		
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextDouble();
		
		d = b *c;
		
		System.out.println("NUMBER = "+a);
		System.out.println("SALARY = U$ "+df.format(d));

	}

}
