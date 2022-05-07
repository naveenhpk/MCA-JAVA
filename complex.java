import java.util.Scanner;
class complex{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		cal c1=new cal();
		cal c2=new cal();
		System.out.println("Enter the 1st Complex Number:");
		c1.input();
		System.out.println("Enter the 2nd Complex Number:");
		c2.input();
		System.out.println("Complex Number 1:");
		c1.display();
		System.out.println("Complex Number 2:");
		c2.display();
		int sum1=c1.a+c2.a;
		int sum2=c1.b+c2.b;
		System.out.println("After Addition:"+sum1+"+i"+sum2);

	}
}
class cal{
	Scanner sn=new Scanner(System.in);
	int a,b;
	void input(){
		System.out.println("Enter real part:");
		a=sn.nextInt();
		System.out.println("Enter imaginary part:");
		b=sn.nextInt();
	}
	void display(){
		System.out.print(""+a+"+i"+b+"\n");
	}
}