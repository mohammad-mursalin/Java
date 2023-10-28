public class Person
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    void displayP()
    {
        System.out.println("Name = " +getName());
        System.out.println("Age = " +getAge());
    }
}