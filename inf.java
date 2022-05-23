import java.util.Scanner;
class inf{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		rect r=new rect();
		cir c=new cir();
		int f=1,ch;
		while (f>0){
			System.out.print("1:Rectangle\n2:Circle\n3:Exit\n");
			System.out.println("Enter your Choice:");
			ch=sn.nextInt();
			switch(ch){
			case 1:
				r.read();
				r.area();
				r.perimeter();
				break;
			case 2:
				c.read();
				c.area();
				c.perimeter();
				break;
			case 3:f=0;
				break;
			default:f=0;
			
			}
		}
	}
}
interface intershape{
	public void area();
	public void perimeter();
}
class rect implements intershape{
	Scanner sn=new Scanner(System.in);
	float area,peri,l,b;
	void read(){
		System.out.println("Enter Length and breadth:");
			l=sn.nextFloat();
			b=sn.nextFloat();
			}
	public void area(){
			area=l*b;
			System.out.println("Area is:"+area);
			
	}
	public void perimeter(){
		peri=2*(l+b);
		System.out.println("perimeter is:"+peri);
	}
}
class cir implements intershape{
	Scanner sn=new Scanner(System.in);
	float area,peri,r;
	void read(){
		System.out.println("Enter Radius:");
			r=sn.nextFloat();
			}
	public void area(){
			area=(float)3.14*r*r;
			System.out.println("Area is:"+area);
			
	}
	public void perimeter(){
		peri=(float)3.14*2*r;
		System.out.println("perimeter is:"+peri);
	}

}