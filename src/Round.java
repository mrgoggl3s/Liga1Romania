import java.util.ArrayList;
import java.util.List;

public class Round {

   private List<Game> games = new ArrayList<>();




   public List<Game> getRound() {
      return games;
   }

   public void printRound() {
      games.forEach(game-> System.out.println(game));
   }

   public void addGame(Team homeTeam, Team awayTeam) {
      Game game = new Game(homeTeam, awayTeam);
      games.add(game);
   }


}
