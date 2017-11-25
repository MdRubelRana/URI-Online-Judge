import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		int dis;
		double pet,way;
		
		
		dis = sc.nextInt();
		pet = sc.nextDouble();
		
		way = dis /pet;
		
		System.out.println(df.format(way)+" km/l");

	}

}
