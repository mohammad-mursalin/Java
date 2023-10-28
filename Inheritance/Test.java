public class Test 
{
    public static void main(String[] args) 
    {
        Student std1 = new Student();
        std1.name = "Mursalin";
        std1.age = 23;
        std1.displayStudentInfo();

        Teacher tech1 = new Teacher();
        tech1.name = "Mohammad";
        tech1.age = 30;
        tech1.status = "Teacher";
        tech1.displayTeacherInfo();
    }
}
