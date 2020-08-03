import java.util.ArrayList;
import java.util.List;

public class Standing {

    List<Round> rounds;


    public Standing(){
       rounds = new ArrayList<>();

    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void addRounds(Round round) {
        rounds.add(round);
    }
}
