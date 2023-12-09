
// class Demo1 implements Runnable{

//     public void run () {

//         for(int i = 1 ; i < 100 ; i++) {

//             System.out.println("In demo1");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
                
//                 e.printStackTrace();
//             }
//         }

//     }
// }

// class Demo2 implements Runnable{

//     public void run () {

//         for(int i = 1 ; i < 100 ; i++) {

//             System.out.println("In demo2");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
                
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class RunnableThread {
    
    public static void main(String[] args) {
        
        Runnable obj1 = () -> { 
            
            for(int i = 1 ; i < 10 ; i++) {

                System.out.println("In demo1");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> { 
            
            for(int i = 1 ; i < 10 ; i++) {

                System.out.println("In demo2");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        };

        //obj1.getPriority();
        //obj1.setPriority(3);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

 
    

