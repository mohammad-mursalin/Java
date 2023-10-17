public class MethodCalling {
    String name;

    void method1(int a)
    {
        a=8;
    }

    void method2(MethodCalling ob2)
    {
        ob2.name = "Lamon";
    }
}
