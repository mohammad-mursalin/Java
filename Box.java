public class Box {
   
    double height,width,depth;

    Box(int h,int w,double d)
    {
        height = h;
        width = w;
        depth = d;
    }

    void displayVol()
    {
        double volume = height*depth*width;
        System.out.println("Volume : " +volume);
    }
}
