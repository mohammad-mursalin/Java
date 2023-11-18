import java.util.HashMap;

public class HashMapDemo {
    
    public static void main(String[] args) {

        HashMap<Integer,String> customer = new HashMap<Integer,String>();

        customer.put(101, "mursalin");
        customer.put(102, "mohammad");

        System.out.println("Customer name : " +customer.get(101));
        System.out.println("Customer name : " +customer.get(102));
    }
}
