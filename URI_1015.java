import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		double x1,x2,y1,y2,res;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		res = Math.sqrt (Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		System.out.println(df.format(res));

	}

}
