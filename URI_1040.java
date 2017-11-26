import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	
		DecimalFormat df = new DecimalFormat ("0.0");
		
		
		double a,b,c,d,med,sco,avg;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		
		med = ( ( (a*2) + (b*3) + (c*4) + (d*1) ) / 10 );
		System.out.println("Media: "+df.format(med));
		
		if ( med>=7.0)
		{
			System.out.println("Aluno aprovado.");
		}
		
		else if ( (med>=5.0) && (med<=6.9))
		{
			System.out.println("Aluno em exame.");
			
			sco = sc.nextDouble();
			System.out.println("Nota do exame: "+sco);
			
			
			avg = ((med + sco) / 2);
			 
			 if ( avg >=5.0)
			 {
				 System.out.println("Aluno aprovado.");
			 }
			 
			 else
			 {
				 System.out.println("Aluno reprovado.");
			 }
			 
			 
			 System.out.println("Media final: "+df.format(avg));
			 
			}
		
		else
		{
			System.out.println("Aluno reprovado.");
		}
		
 
	}

}
