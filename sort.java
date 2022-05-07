import java.util.Scanner;
class sort{
	public static void main(String[] args) {
		String temp;
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter total number of strings:");
		int n=sn.nextInt();
		String name[]=new String[n];
		System.out.println("Enter Names:");
		for (int i=0;i<n;i++) {
			name[i]=sn.next();
		}
		System.out.println("----\nNames:");
		for (int i=0;i<n;i++) {
			System.out.println(""+name[i]);
		}
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++ ) {
				if(name[i].compareTo(name[j])<0){
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}

			}
		}
		System.out.println("----\nSorted:");
		for (int i=0;i<n;i++) {
			System.out.println(""+name[i]);
		}
	}
}