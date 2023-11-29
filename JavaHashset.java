import java.util.HashSet;

public class JavaHashset {

    public static void main(String[] args) {
        
        HashSet<String> fruitName = new HashSet<>();

        fruitName.add("Apple");
        fruitName.add("Banana");
        fruitName.add("Berry");
        fruitName.add("Apple");  //Hashset won't store duplicate value

        System.out.println(fruitName);

        System.out.println("Size : " +fruitName.size());

        fruitName.remove("Berry");
        System.out.println("After removing berry from list : " +fruitName);

        fruitName.removeAll(fruitName);
        System.out.println("Is fruitname empty ? " +fruitName.isEmpty());
    }
}