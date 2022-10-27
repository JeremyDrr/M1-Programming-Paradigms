import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        ArrayList<Publication> aPublications = new ArrayList<>();
        Calendar a1Cal = new Calendar.Builder().setDate(1999,6,24).build();
        Calendar a2Cal = new Calendar.Builder().setDate(2000,6,24).build();
        Journal aJournal1 = new Journal("Jeremy's journal 1", a1Cal, 1, "Journal 1", 1);
        Journal aJournal2 = new Journal("Jeremy's journal 2", a2Cal, 1, "Journal 2", 1);
        ConferenceProceeding aConf1 = new ConferenceProceeding("Volume 1", a1Cal, 1, "Conference 1", true);
        ConferenceProceeding aConf2 = new ConferenceProceeding("Volume 2", a2Cal, 3, "Conference 2", false);
        aPublications.add(aJournal1);
        aPublications.add(aJournal2);
        aPublications.add(aConf1);
        aPublications.add(aConf2);

        ArrayList<Publication> bPublications = new ArrayList<>();
        Calendar b1Cal = new Calendar.Builder().setDate(2001,6,24).build();
        Calendar b2Cal = new Calendar.Builder().setDate(2002,6,24).build();
        Journal bJournal1 = new Journal("Corina's journal 1", b1Cal, 1, "Biography", 1);
        Journal bJournal2 = new Journal("Corina's journal 2", b2Cal, 1, "The necromicon", 1);
        ConferenceProceeding bConf1 = new ConferenceProceeding("Volume 1", b1Cal, 2, "Blah Blah Thingy", false);
        ConferenceProceeding bConf2 = new ConferenceProceeding("Volume 2", b2Cal, 3, "The necromicon comic-con", true);
        bPublications.add(bJournal1);
        bPublications.add(bJournal2);
        bPublications.add(bConf1);
        bPublications.add(bConf2);

        ArrayList<Author> authors = new ArrayList<>();
        Author a = new Author("Jeremy", aPublications);
        Author b = new Author("Corina", bPublications);
        authors.add(a);
        authors.add(b);

        University uni = new University("Politehnica", "Bucharest", authors);

        System.out.println(uni.computeScore());
    }
}