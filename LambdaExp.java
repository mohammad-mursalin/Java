@FunctionalInterface
interface Demo {

    int add (int i, int j);
}

public class LambdaExp {

    public static void main(String[] args) {
        
        Demo obj = (i,j) -> i+j;

        int result = obj.add(4, 5);

        System.out.println(result);
    }
}