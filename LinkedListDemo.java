import java.util.LinkedList;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        
        LinkedList<String> p = new LinkedList<String>();
        LinkedList<String> p1 = new LinkedList<String>();

        p.add("Mursalin");
        p.add(" Shoktiban");

        System.out.println(p);

        p.add(0, "Toki");
        p.addFirst("Mohammad");
        p.addLast("lamon");

        System.out.println(p);

        p1.addAll(p);

        System.out.println(p1);

        p1.remove("lamon");
        System.out.println(p1);

        p1.remove(3);
        System.out.println(p1);

        p1.removeAll(p1);
        System.out.println(p1);

        p.clear();
    }
}
