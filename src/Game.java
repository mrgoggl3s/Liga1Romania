public class Game {


    private Team homeTeam;
    private Team awayTeam;
    private int goalsOfHomeTeam;
    private int goalsOfAwayTeam;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getGoalsOfHomeTeam() {
        return goalsOfHomeTeam;
    }

    public void setGoalsOfHomeTeam(int goalsOfHomeTeam) {
        this.goalsOfHomeTeam = goalsOfHomeTeam;
    }

    public int getGoalsOfAwayTeam() {
        return goalsOfAwayTeam;
    }

    public void setGoalsOfAwayTeam(int goalsOfAwayTeam) {
        this.goalsOfAwayTeam = goalsOfAwayTeam;
    }

    public boolean containsTeam(Team team) {
        return this.awayTeam.equals(team)
                || this.homeTeam.equals(team);
    }

    @Override
    public String toString() {
        return "Game{" +
                "homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", goalsOfHomeTeam=" + goalsOfHomeTeam +
                ", goalsOfAwayTeam=" + goalsOfAwayTeam +
                '}';
    }
}
