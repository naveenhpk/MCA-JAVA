package arithmetic;
import java.util.Scanner;
public class addi implements ar
{
	Scanner sc=new Scanner(System.in);
	int a,b;
	public void read()
	a=sc.nextInt();
	{
	System.out.println("Enter the 1st & 2nd number: ");
	b=sc.nextInt();
	}
	public void result()
	{
		int res=a+b;
		System.out.println("Sum: "+res);
	}
}