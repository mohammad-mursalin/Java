@FunctionalInterface
interface Demo {
    void show();  //void show(int i);
}

public class LambdaExpression {
    
    public static void main(String[] args) {

        Demo obj = () -> System.out.println("In show");  //(i)

        obj.show();
        
    }
}
