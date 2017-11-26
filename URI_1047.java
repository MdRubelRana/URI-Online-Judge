import java.util.Scanner;

public class URI_1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int sth,eth,stm,etm,dth,dtm;
		
		sth = sc.nextInt();
		stm = sc.nextInt();
		eth = sc.nextInt();
		etm = sc.nextInt();
		
		dth  = eth - sth;
		dtm = etm - stm;
		
		if (dth < 0)
		{
			dth = 24 + dth;
		}
		
		if ( dtm < 0)
		{
			dtm = 60 + dtm;
			dth--;
		}
		
		if ( (sth == eth) && (stm == etm))
		{
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		else
		{
			System.out.println("O JOGO DUROU "+dth +" HORA(S) E " +dtm+ " MINUTO(S)");
		}
		

	}

}
