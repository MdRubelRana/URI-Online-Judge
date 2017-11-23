import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		
		int id1,id2,qua1,qua2;
		double pri1,pri2,pri;
		
		id1 = sc.nextInt();
		qua1 = sc.nextInt();
		pri1 = sc.nextDouble();
		
		id2 = sc.nextInt();
		qua2 = sc.nextInt();
		pri2 = sc.nextDouble();
		
		pri = ((qua1 * pri1) + (qua2 * pri2));
		
		System.out.println("VALOR A PAGAR: R$ "+df.format(pri));

	}

}
