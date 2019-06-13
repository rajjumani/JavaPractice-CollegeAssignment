package average;

public class Statistics {

	static double avg;
	
	public static double average(int[] a) {
		
		
		int sum=0;
		System.out.println("The given array is ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
		avg=sum/a.length;
		return avg;
	}
	
	
	public static void main(String[] args) {
		
		int[] a={2,4,3,5,6};
		
		Statistics a1=new Statistics();
		a1.average(a);
		System.out.println("\n\nAverage of the given numbers is "+avg);
		

	}


}
