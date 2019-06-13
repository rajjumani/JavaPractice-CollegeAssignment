package studentsort;

import java.util.Scanner;

public class Student {
	
	String name;
	int age;
	Scanner in=new Scanner(System.in);
	
	public void setdata() {
		
			System.out.print("Name:");
			name=in.next();
			System.out.print("Age:");
			age=in.nextInt();
	}
	
	public void print() {
		
			System.out.print("Name:"+name+"\tAge:"+age+"\n");
	}

	public int rage() {
		return age;
	}
}
