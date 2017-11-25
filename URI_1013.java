import java.util.Scanner;

public class URI_1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a,b,c,m,x;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		m = (a + b + Math.abs(a-b)) / 2;
		x = (m + c + Math.abs(m-c)) / 2;
		
		
		System.out.println(x +" eh o maior");

	}

}
