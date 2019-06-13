package SortArray;

public class SortArray {

	public void sort(int a[]) {
		int tmp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]>a[j])
				{
				tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
				}
			}
		}
		
		System.out.println("The sorted array is:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
