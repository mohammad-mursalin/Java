class Demo1 {

    public void show() {

        System.out.println("Inside show");
    }

    public class InsideDemo {

        public void display() {

            System.out.println("Inside display");
        }
    }    

    public static  class InsideDemo1 {

        public void display1 () {

            System.out.println("Inside display1");
        }
    
    }
}
public class InnerClass {
    
    public static void main(String[] args) {
        
        Demo1 obj = new Demo1();
        obj.show();

        Demo1.InsideDemo obj1 = obj.new InsideDemo();
        obj1.display();

        Demo1.InsideDemo1 obj2 = new Demo1.InsideDemo1();
        obj2.display1();
    }
}
