import java.util.Calendar;

public class ConferenceProceeding extends Publication{

    /*
     * ConferenceProceeding extends Publication. In addition a ConferenceProceeding has a volumeName and a boolean indexed.
     * If the ConferenceProceeding is indexed, the score is computed : 0.25/numberOfAuthors.
     * If the ConferenceProceeding is not indexed, the score is computed : 0.2/numberOfAuthors.
     */

    private String volumeName;
    private boolean indexed;

    public ConferenceProceeding(String name, Calendar calender, int numberOfAuthors, String volumeName, boolean indexed) {
        super(name, calender, numberOfAuthors);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }


    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public boolean isIndexed() {
        return indexed;
    }

    public void setIndexed(boolean indexed) {
        this.indexed = indexed;
    }

    @Override
    public double computeScore() {
        if(indexed){
            return 0.25/super.getNumberOfAuthors();
        }else{
            return 0.2/super.getNumberOfAuthors();
        }
    }
}
