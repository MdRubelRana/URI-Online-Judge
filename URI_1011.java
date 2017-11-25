import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		double a,PI=3.14159,R;
		
		R = sc.nextDouble();
		a = (4.0/3) * PI * R * R * R;
		
		System.out.println("VOLUME = "+df.format(a));
		
		
		
	}

}
