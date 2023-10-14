public class Variables {
    int id;
    String name;  // here id and name is instance variable
    static int phone; // static or class variable

    void variableType(int x,String y)  // here x and y is local variable
    {
        id = x;
        name = y;
    }

    void dislpay()
    {
        System.out.println("name : " +name);
    }
}
