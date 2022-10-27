import java.util.ArrayList;
public class Portfolio{
    private int noShares;
    private ArrayList<Share> shares = new ArrayList<>();
    public Portfolio() {

    }
    public int getNoShares() {
        return noShares;
    }

    public void setNoShares(int noShares) {
        this.noShares = noShares;
    }

    public void addShare(Share s){
        shares.add(s);
    }

    public double computeSum() {
        double score=0.0;
        for(Share s: shares)
        {
            score+=s.getValue();
        }
        return score;
    }
}