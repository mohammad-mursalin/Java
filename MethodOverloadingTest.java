public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading ob = new MethodOverloading();
        ob.add();
        ob.add(4);
        ob.add(4,5);
        ob.add(5.4,6.3);
        ob.add(0, 0, 0);
        
    }
}
