public class Car extends Vehicle 
{
    int gear;

    Car(int g,String c,double w)
    {
        super(c, w);
        gear = g;
    }

    void Attributes()
    {
        super.Attributes();
        System.out.println("Gear : " +gear);
    }
}
