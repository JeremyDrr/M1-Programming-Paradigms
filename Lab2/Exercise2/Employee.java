package Exercise2;

public class Employee{

    //Attributes
    private String fName;
    private String lName;
    private String email;
    private String address;
    private double salary;

    //Constructor with parameters
    public Employee(String fName, String lName, String email, String address, double salary) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    //Getters and setters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}