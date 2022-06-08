import java.util.Scanner;

class negative extends Exception 
{
	public negative(String str)
	{
		super(str);
	}
}

class nums
{
	int n,i,sum=0,x,avg;
	void avg() throws negative 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit: ");
		n=sc.nextInt();
		System.out.println("Enter the Numbers");
		for(i=0;i<n;i++)
		{
			
			x=sc.nextInt();
			if(x<0)
			{
				throw new negative("-ve number not allowed");
			}
			else
			{
				sum=sum+x;
				avg=sum/n;
			}
		}
		
	System.out.println("Average is: "+avg);
	}
}

class Average
{
	public static void main(String args[])
	{
		
		try
		{	
			nums a=new nums();
			a.avg();
		}
		catch(negative n)
		{
			System.out.println("Exception  \n"+n);
		}
	}
}