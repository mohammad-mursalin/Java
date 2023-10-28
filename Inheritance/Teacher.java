public class Teacher extends Student
{
    String status;

    void displayTeacherInfo()
    {
        displayStudentInfo();
        System.out.println("Status : " +status);
    }
}
