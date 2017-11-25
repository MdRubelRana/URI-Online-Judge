import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		
		double a,b,c,PI=3.14159;
		double rec,tra,cir,sqr,are;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		rec = 0.5 * (a * c);
		tra = 0.5 * (a + b) * c; 		
		cir = PI * c * c;
		sqr = b * b;
		are = a * b;
		
		System.out.println("TRIANGULO: "+df.format(rec));
		System.out.println("CIRCULO: "+df.format(cir));
		System.out.println("TRAPEZIO: "+df.format(tra));
		System.out.println("QUADRADO: "+df.format(sqr));
		System.out.println("RETANGULO: "+df.format(are));
		
		
		

	}

}
