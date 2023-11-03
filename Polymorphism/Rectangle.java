public class Rectangle extends Shape{

    double height,width;

    Rectangle(double height,double width)
    {
        this.height = height;
        this.width = width;
    }

    double display(){

        System.out.println("Area of Rectangle");
        return width*height;
    }
}