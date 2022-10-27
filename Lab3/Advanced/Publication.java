import java.util.Calendar;

public abstract class Publication {

    /*
     * Publication class is abstract (since we do not know how to compute the score for a generic publication).
     * Each Publication has a name, apparition date and number of authors.
     * The method computeScore() is abstract and will be overridden in the subclasses.
     */

    private String name;
    private Calendar apparition;
    private int numberOfAuthors;

    public Publication(String name, Calendar apparition, int numberOfAuthors) {
        this.name = name;
        this.apparition = apparition;
        this.numberOfAuthors = numberOfAuthors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getApparition() {
        return apparition;
    }

    public void setApparition(Calendar apparition) {
        this.apparition = apparition;
    }

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }

    public void setNumberOfAuthors(int numberOfAuthors) {
        this.numberOfAuthors = numberOfAuthors;
    }

    public abstract double computeScore();
}
