public class Test {

    public static void main(String[] args) {
        
        Person p = new Person(){

            void display(){

                System.out.println("Overriding display function");
            }
        };

        p.display();
        
    }
    
}
