class Demo1 {

    public void show() {

        System.out.println("Inside show");
    }

    public class InsideDemo {

        public void display() {

            System.out.println("Inside display");
        }
    }
}
public class InnerClass {
    
    public static void main(String[] args) {
        
        Demo1 obj = new Demo1();
        obj.show();

        Demo1.InsideDemo obj1 = obj.new InsideDemo();
        obj1.display();
    }
}
