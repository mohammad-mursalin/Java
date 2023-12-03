class Aa {

    public Aa() {

        System.out.println("Inside constructor of Aa");
    }

    public Aa(int n) {

        System.out.println("Inside constructor of Aa int");
    }

}

class Bb extends Aa {

public Bb() {

    super();  
    
    System.out.println("Inside constructor of Bb");
}

public Bb(int n) {

    this();

    System.out.println("Inside constructor of Bb int");
}

}

public class SuperKeyword {
    
    public static void main(String[] args) {
        
        Bb obj = new Bb(6);
    }
}
