public class MethodCallingTest {
    public static void main(String[] args) {
        MethodCalling ob = new MethodCalling();
        int x = 3;
        System.out.println("x before calling : " +x);
        ob.method1(x);  // call by value
        System.out.println("x after calling = " +x);

        MethodCalling ob1 = new MethodCalling();
        ob1.name="Mursalin";
        System.out.println("name before calling : " +ob1.name);
        ob1.method2(ob1);   // call by reference
        System.out.println("Name after calling : " +ob1.name);
    }

    
}
