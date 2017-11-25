import java.util.Scanner;

public class URI_1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		 double taka;
		 int taka1,note;
		 
		 taka = sc.nextDouble();
		 
		 taka1 =(int) (taka * 100);
		 
		 System.out.println("NOTAS:");
		 
		 System.out.println(taka1/10000+" nota(s) de R$ 100.00");
		 note = taka1 % 10000;
		 
		 System.out.println(note/5000+" nota(s) de R$ 50.00");
		 note = note%5000;
		 
		 System.out.println(note/2000+" nota(s) de R$ 20.00");
		 note = note%2000;
		 
		 System.out.println(note/1000+" nota(s) de R$ 10.00");
		 note = note%1000;
		 
		 System.out.println(note/500+" nota(s) de R$ 5.00");
		 note = note%500;
		 
		 System.out.println(note/200+" nota(s) de R$ 2.00");
		 note = note%200;
		 
		 
		 
		 
		 System.out.println("MOEDAS:");
		 
		 System.out.println(note/100+" moeda(s) de R$ 1.00");
		 note = note%100;
		 
		 System.out.println(note/50+" moeda(s) de R$ 0.50");
		 note = note%50;
		 
		 System.out.println(note/25+" moeda(s) de R$ 0.25");
		 note = note%25;
		 
		 System.out.println(note/10+" moeda(s) de R$ 0.10");
		 note = note%10;
		 
		 System.out.println(note/5+" moeda(s) de R$ 0.05");
		 note = note%5;
		 
		 System.out.println(note/1+" moeda(s) de R$ 0.01");
		 
		 
		
	}

}
