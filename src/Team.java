import java.util.Objects;

public class Team {

    private String name;
    private int totalGoalsReceived;
    private int totalGoalsScored;
    private int winners;
    private int draws;
    private int losses;


    public Team(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getPoints() {
        return 3 * winners + 1 * draws + 0 * losses;
    }

    public int getTotalGoalsReceived() {
        return totalGoalsReceived;
    }

    public int getTotalGoalsScored() {
        return totalGoalsScored;
    }

    public int getGamesPlayed() {
        return winners+draws+losses;
    }

    public int getWinners() {
        return winners;
    }

    public int getDraws() {
        return draws;
    }

    public int getLosses() {
        return losses;
    }

    public void addGoalsScored(int goalsScored) {
        totalGoalsScored += goalsScored;
    }

    public void addGoalsReceived(int goalsReceived) {
        totalGoalsReceived += goalsReceived;
    }

    public void incrementWins() {
        winners+=1;

    }
    public void incrementDraws() {
        draws+=1;
    }
    public void incrementLosses() {
        losses+=1;
    }


    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", gamesPlayed=" + getGamesPlayed() +
                ", totalGoalsReceived=" + totalGoalsReceived +
                ", totalGoalsScored=" + totalGoalsScored +
                ", winners=" + winners +
                ", draws=" + draws +
                ", losses=" + losses +
                ", points=" + getPoints() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
