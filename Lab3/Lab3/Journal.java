import java.util.Calendar;

public class Journal extends Publication{

    /*
     * Journal extends Publication. In addition, a Journal has a journalName and an impactFactor.
     * For a Journal the score is computed like this: (impactFactor * 0.5) / numberOfAuthors.
     */

    private String journalName;
    private double impactFactor;

    public Journal(String name, Calendar calendar, int numberOfAuthors, String journalName, double impactFactor) {
        super(name, calendar, numberOfAuthors);
        this.journalName = journalName;
        this.impactFactor = impactFactor;
    }

    @Override
    public double computeScore() {
        return (impactFactor * 0.5)/getNumberOfAuthors();
    }
}
