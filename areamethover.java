class areamethover
{
    void Area(int x)
    {
        System.out.println("Area of the square: "+x*x+" sq units");
    }
    void Area(int x, int y)
    {
        System.out.println("Area of the rectangle: "+x*y+" sq units");
    }
    void Area(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area+" sq units");
    }
    void Area(double b,double h)
    {
        double area = (b*h)/2;
        System.out.println("Area of the TRiangle: "+area+" sq units");
    }

    public static void main(String args[]){
       areamethover obj = new areamethover();
        obj.Area(6);
        obj.Area(10,22); 
        obj.Area(6.1);
        obj.Area(56.6,7.6);
    }
}