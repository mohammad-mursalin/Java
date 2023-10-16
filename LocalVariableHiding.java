public class LocalVariableHiding {
    double height,width,depth;

    LocalVariableHiding(int height,int width,double depth)
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVol1()
    {
        double volume = height*depth*width;
        System.out.println("Volume : " +volume);
    }
}
