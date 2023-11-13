public class AccesModifier {

    private void display1(){

        System.out.println("Private member can only be used in the same class");

    }

    protected void display2(){

        System.out.println("Protected members can be used in the same package and childs classes from another package");
    }

    void display3(){

        System.out.println("Default members can only be used in the same package");
    }

}