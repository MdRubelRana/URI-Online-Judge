import java.util.Scanner;

public class URI_1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int taka,note;
		 
		 taka = sc.nextInt();
		 
		 System.out.println(taka);
		 
		 System.out.println(taka/100+" nota(s) de R$ 100,00");
		 note = taka%100;
		 
		 System.out.println(note/50+" nota(s) de R$ 50,00");
		 note = note%50;
		 
		 System.out.println(note/20+" nota(s) de R$ 20,00");
		 note = note%20;
		 
		 System.out.println(note/10+" nota(s) de R$ 10,00");
		 note = note%10;
		 
		 System.out.println(note/5+" nota(s) de R$ 5,00");
		 note = note%5;
		 
		 System.out.println(note/2+" nota(s) de R$ 2,00");
		 note = note%2;
		 
		 System.out.println(note/1+" nota(s) de R$ 1,00");
		 note = note%1;

	}

}
