import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00000");
		
		double a,b,MEDIA;
		
		System.out.println("SALA");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		MEDIA = ((a*3.5) + (b*7.5))/(3.5 + 7.5);
		System.out.println("MEDIA = "+df.format(MEDIA));

	}

}
