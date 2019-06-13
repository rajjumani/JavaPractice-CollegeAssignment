package friendsort;

import java.util.Scanner;

public class DOB {
	
	int d,m,y;
	Scanner in=new Scanner(System.in);


	public void setdate() {
		
		System.out.print("Day-");
		d=in.nextInt();
		
		System.out.print("Month-");
		m=in.nextInt();
		
		System.out.print("Year-");
		y=in.nextInt();
	}
	
}
