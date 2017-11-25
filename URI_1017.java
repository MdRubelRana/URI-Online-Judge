import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		double time,dis,way,pet;
		
		time = sc.nextInt();
		dis = sc.nextInt();
		
		way = time * dis;
		
		pet = way/12;
		System.out.println(df.format(pet));
		
		

	}

}
