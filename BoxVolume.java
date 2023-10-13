public class BoxVolume {
    public static void main(String[] args) {

        System.out.println("Volume of box 1 ");

        Box box1 = new Box(10, 10, 10);
        box1.displayVol();
        LocalVariableHiding box = new LocalVariableHiding(10, 10, 10); //another way
        box.displayVol1();
        

        System.out.println("Volume of box 2 ");

        Box box2 = new Box(20, 30, 10);
        box2.displayVol();
    }
}
