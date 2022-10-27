import java.util.ArrayList;

public class University {

    /*
     * University class contains an array of Authors and the ability to add new authors. computeScore() in
     * University returns the sum of scores of each Author. University has a bidirectional relation to Author so
     * University has an array of Authors while the Author has a University.
     */

    private String name;
    private String location;
    private ArrayList<Author> authors;

    public University(String name, String location, ArrayList<Author> authors) {
        this.name = name;
        this.location = location;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author a){
        authors.add(a);
    }

    public double computeScore(){

        double score = 0.0;

        for(Author author : authors){
            score += author.computeScore();
        }

        return score;
    }
}
