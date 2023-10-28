public class Teacher extends Person 
{
    private String status;

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    void displayT()
    {
        displayP();
        System.out.println("Status = " +getStatus());
    }
}
