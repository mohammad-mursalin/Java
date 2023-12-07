@FunctionalInterface
interface Demo {
    void show();
}

public class LambdaExpression {
    
    public static void main(String[] args) {

        Demo obj = () -> System.out.println("In show");

        obj.show();
        
    }
}
