class Demo1 extends Thread{
    public void run () {

        for(int i = 1 ; i < 100 ; i++) {

            System.out.println("In demo1");
        }

    }
}

class Demo2 extends Thread{

    public void run () {

        for(int i = 1 ; i < 100 ; i++) {

            System.out.println("In demo2");
        }
    }
}

public class MultipleThreads {
    
    public static void main(String[] args) {
        
        Demo1 obj1 = new Demo1();

        Demo2 obj2 = new Demo2();

        obj1.start();
        obj2.start();
    }
}
