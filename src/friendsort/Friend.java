package friendsort;

import java.util.Scanner;

public class Friend {

	String name;
	DOB dob=new DOB();
	Scanner in=new Scanner(System.in);
	
	
	
	public void setdata() {
		
			System.out.print("Name:");
			name=in.next();
			System.out.print("Date of Birth:\n");
			dob.setdate();
	}
	
	public void print() {
		
			System.out.print("Name:"+name+"\tDOB:"+dob.d+"/"+dob.m+"/"+dob.y+"\n");
	}

}
