package studentsort;

public class Studentapp {

	public static Student s[]=new Student[5];
	
	public static void sort(Student s[]) {
		Student tmp;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				if(s[i].rage()<s[j].rage())
				{
					tmp=s[i];
					s[i]=s[j];
					s[j]=tmp;
				}
			}
		}
	}
	public static void main(String[] args) {

		
		for (int i = 0; i < s.length; i++) {
			s[i]=new Student();
			System.out.println("Enter info for student "+(i+1));
			s[i].setdata();
		}
		 
		sort(s);
		
		System.out.println("After sorting:");
		for (int i = 0; i < s.length; i++) {
			s[i].print();
		}
	}

}
