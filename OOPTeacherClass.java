public class OOPTeacherClass 
{
    String name,gender;
    int age;
    int code = 121;

    void setInfo(String n,String g,int a)   //a way for initialize values 
    {
        name = n;
        gender = g;
        age = a;
    }

    OOPTeacherClass(String n,String g,int a)  //    OOPTeacherClass(String n,String g,int a) 
    {
        name = n;
        gender = g;
        age = a;
    }

    public OOPTeacherClass() {   //forget this part
    }

    void displayInfo()
    {
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("Age : " +age);
        System.out.println("Code : " +code);
        System.out.println("\n");
    }
}
