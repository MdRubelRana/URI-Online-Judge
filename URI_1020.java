import java.util.Scanner;

public class URI_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int d,d1,year,month,day;
		
		d = sc.nextInt();
		
		d1 = d / 365;
		year = d % 365;
		month = year / 30;
		day = year % 30;
		
		System.out.println(d1+ " ano(s)");
		System.out.println(month+ " mes(es)");
		System.out.println(day+ " dia(s)");
		

	}

}
