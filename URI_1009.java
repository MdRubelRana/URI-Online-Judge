import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat dc = new DecimalFormat ("0.00");
		
		String name;
		double a,b,c,d;
		
		name = sc.nextLine();
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		c = (b * 15 /100);
		
		d = a + c;
		
		System.out.println("TOTAL = R$ " +dc.format(d));
		
		
		

	}

}
