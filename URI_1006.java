import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		
		double a,b,c,MEDIA;
		
		System.out.println("SALA");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		MEDIA = ((a*2) + (b*3) + (c*5))/(2 + 3 + 5);
		System.out.println("MEDIA = "+df.format(MEDIA));

	}

}
