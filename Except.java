import java.util.Scanner;
class  userpass extends Exception
{
	public userpass(String str)
	{
	super(str);
	}
} 


class pgm1
{
Scanner sc=new Scanner(System.in);
String user="naveen",pass="1234";
String us,ps;
void get() throws userpass
{
System.out.println("Enter the username:");
us=sc.next();
System.out.println("Enter the password:");
ps=sc.next();
if(us.equals(user) && ps.equals(pass))
{
System.out.println("Login successfull");
}
else
{
throw new userpass("Invalid username or password");
}
}
}

class Except
{
public static void main(String args[])
{
pgm1 c=new pgm1();
try
{
c.get();
}
catch(userpass u)
{
System.out.println("Exception \n"+u);	
}
}
}