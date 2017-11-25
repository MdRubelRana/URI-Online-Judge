import java.util.Scanner;

public class URI_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int sec,sec1,hour,min,second;
		
		sec= sc.nextInt();
		
		sec1 = sec / 3600;
		
		hour = sec % 3600;
		min = hour / 60;
		second = hour % 60;
		
		System.out.println(sec1+":"+min +":"+second);
		

	}

}
