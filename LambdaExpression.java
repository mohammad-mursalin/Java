@FunctionalInterface
interface Demo {
    void show();  //void show(int i);
}

public class LambdaExpression {
    
    public static void main(String[] args) {    // we only have one statement that's why curly brakets are not given

        Demo obj = () -> System.out.println("In show");  //(i)

        obj.show();
        
    }
}
