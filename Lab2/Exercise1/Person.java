package Exercise1;

public class Person implements Comparable<Person>{

    //Attributes
    private String name;
    private String cnp;
    private String address;

    //Constructor by default
    public Person() {

    }

    //Constructor with parameters
    public Person(String name, String cnp, String address) {
        this.name = name;
        this.cnp = cnp;
        this.address = address;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public String getCnp() {
        return cnp;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Override the method from the Comparable interface
    @Override
    public int compareTo(Person o) {

        return this.name.compareTo(o.name);
    }
}