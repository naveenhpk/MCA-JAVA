import java.util.Scanner;
class emp
{
String id,ename;
int esalary;
Scanner sc=new Scanner(System.in);
void getdetails()
{
System.out.println("\nEnter the employee id:");
id=sc.next();
System.out.println("Enter the employee name:");
ename=sc.next();
System.out.println("Enter the salary:");
esalary=sc.nextInt();
}

void display()
{
System.out.println("Employee id:"+id);
System.out.println("Employee name:"+ename);
System.out.println("Employee salary:"+esalary);
}
}


class empdetails
{
	public static void main(String args[])
	{
	int n,c=0,i;
	Scanner sc=new Scanner(System.in);
	String x;
 System.out.println("Enter the no of employees:");
 n=sc.nextInt();
 emp e[]=new emp[n];

 for(i=0;i<e.length;i++)
 {
 	e[i]=new emp();
 e[i].getdetails();
 }
System.out.println("\nSearch ");
System.out.println("Enter the employee id to search:");
x=sc.next();
for(i=0;i<e.length;i++)
{
if(e[i].id.equals(x))
{ 
   c=1;
	e[i].display();

	break;
}
}
if(c==0)
System.out.println("Employee id not found");
}
}