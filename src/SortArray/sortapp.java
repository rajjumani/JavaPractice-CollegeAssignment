package SortArray;

public class sortapp {

	public static void main(String[] args) {
		
		int[] a=new int[args.length];
		for (int i = 0; i < a.length; i++) {
			a[i]=Integer.parseInt(args[i]);
		}
		SortArray arr=new SortArray();
		arr.sort(a);

	}

}
