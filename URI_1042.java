import java.util.Scanner;

public class URI_1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		
		int a,b,c,min,min1,max;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		min = Math.min(a, Math.min(b,c));
		
		
		if(min==a)
		{
			min1 = Math.min(b, c);
			max = Math.max(b, c);
			
		}
		
		else if (min==b)
		{
			min1 = Math.min(a, c);
			max = Math.max(a, c);
		}
		
		else 
		{
			min1 = Math.min(a, b);
			max = Math.max(a, b);
		}
		
		System.out.println(min);
		System.out.println(min1);
		System.out.println(max);
		System.out.print("\n");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
