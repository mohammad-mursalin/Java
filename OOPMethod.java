public class OOPMethod 
{
    public static void main(String[] args) 
    {
        OOPTeacherClass teacher1 = new OOPTeacherClass();
        teacher1.name = "Mursalin";   // a way for initialize values 
        teacher1.gender = "Male";
        teacher1.age = 23;
        teacher1.displayInfo();   // using method to display information instead of print it several times

        OOPTeacherClass teacher2 = new OOPTeacherClass();
        teacher2.name = "Lamon";
        teacher2.gender = "Male";
        teacher2.age = 23;
        teacher2.displayInfo();

        OOPTeacherClass teacher3 = new OOPTeacherClass();
        teacher3.setInfo("Toki","Male",24);   // a mathods can also be used for taking data
        teacher3.displayInfo();

        OOPTeacherClass teacher4 = new OOPTeacherClass("Joy","Male", 23);  // a way for initialize values 
        teacher4.displayInfo();
    }
}
