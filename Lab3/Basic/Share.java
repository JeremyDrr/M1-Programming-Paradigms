public class Share {
    private double value;
    private Company company;
    public Share(double value, Company company) {
        this.value=value;
        this.company = company;

    }
    public double getValue() {
        return value;
    }

    public void setName(double value) {
        this.value = value;
    }
}