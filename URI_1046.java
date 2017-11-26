import java.util.Scanner;

public class URI_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int st,et,dt;
		
		st = sc.nextInt();
		et = sc.nextInt();
		
		dt  = et - st;
		
		if(dt<0)
		{
			dt = 24 + dt;
		}
		
		if ( st == et)
		{
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else
		{
			System.out.println("O JOGO DUROU "+dt +" HORA(S)");
		}
		

	}

}
