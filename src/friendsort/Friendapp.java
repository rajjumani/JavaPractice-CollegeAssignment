package friendsort;

public class Friendapp {
	
public static Friend f[]=new Friend[5];
	
	public static void sort(Friend f[]) {
		Friend tmp;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(f[i].dob.y<f[j].dob.y)
				{
					tmp=f[i];
					f[i]=f[j];
					f[j]=tmp;
				}
				else if(f[i].dob.y==f[j].dob.y){
					if(f[i].dob.m<f[j].dob.m)
					{
						tmp=f[i];
						f[i]=f[j];
						f[j]=tmp;
					}
					else if(f[i].dob.m==f[j].dob.m){
						if(f[i].dob.d<f[j].dob.d)
						{
							tmp=f[i];
							f[i]=f[j];
							f[j]=tmp;
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < f.length; i++) {
			f[i]=new Friend();
			
			System.out.println("Enter info for friend "+(i+1));
			f[i].setdata();
		}
		 
		sort(f);
		
		System.out.println("After sorting:");
		for (int i = 0; i < f.length; i++) {
			f[i].print();
		}
	}

}
