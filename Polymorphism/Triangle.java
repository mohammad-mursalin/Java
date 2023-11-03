public class Triangle extends Shape{

    double base,height;

    Triangle(double b,double h)
    {
        base = b;
        height = h;
    }

    double display()
    {
        System.out.println("Area of Triangle");
        return .5*base*height;
    }
}