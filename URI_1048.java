import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double old,now=0,sal=0;
		
		old = sc.nextDouble();
		
		if ( (old >= 0) && (old <= 400) )
		{
			now = ( old * 0.15);
			sal = old + now;
			System.out.println("Novo salario: " +df.format(sal));
			System.out.println("Reajuste ganho: "+df.format(now));
			System.out.println("Em percentual: 15 %");
		}
		
		if ( (old >= 400.01) && (old <= 800) )
		{
			now = ( old * 0.12);
			sal = old + now;
			System.out.println("Novo salario: " +df.format(sal));
			System.out.println("Reajuste ganho: "+df.format(now));
			System.out.println("Em percentual: 12 %");
		}
		
		if ( (old >= 800.01) && (old <= 1200.00) )
		{
			now = ( old * 0.10);
			sal = old + now;
			System.out.println("Novo salario: " +df.format(sal));
			System.out.println("Reajuste ganho: "+df.format(now));
			System.out.println("Em percentual: 10 %");
		}
		
		if ( (old >= 1200.01) && (old <= 2000.00) )
		{
			now = ( old * 0.07);
			sal = old + now;
			System.out.println("Novo salario: " +df.format(sal));
			System.out.println("Reajuste ganho: "+df.format(now));
			System.out.println("Em percentual: 7 %");
		}
		
		if (old >2000.00)
		{
			now = ( old * 0.04);
			sal = old + now;
			System.out.println("Novo salario: " +df.format(sal));
			System.out.println("Reajuste ganho: "+df.format(now));
			System.out.println("Em percentual: 4 %");
		}
		
		
	}

}
