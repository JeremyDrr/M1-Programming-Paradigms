import java.util.ArrayList;

public class Author{

    /*
     * Author has a name and an array of Publications.
     * addPublication() adds a new Publication while
     * computeScore() returns the sum of all Publications.
     */

    private String name;
    private ArrayList<Publication> publications;

    public Author(String name, ArrayList<Publication> publications) {
        this.name = name;
        this.publications = publications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public void setPublications(ArrayList<Publication> publications) {
        this.publications = publications;
    }

    public void addPublication(Publication p){
        publications.add(p);
    }

    public double computeScore(){

        double score = 0;

        for(Publication p : publications){
            score += p.computeScore();
        }

        return score;
    }
}
