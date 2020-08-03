import java.util.ArrayList;
import java.util.List;

public class Standing {

    List<Round> rounds;


    private static Standing standing;

    private Standing(){
       rounds = new ArrayList<>();

    }

    public static Standing getInstance() {
        if (standing == null) {
            standing = new Standing();
        }
        return standing;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void addRounds(Round round) {
        rounds.add(round);
    }
}
