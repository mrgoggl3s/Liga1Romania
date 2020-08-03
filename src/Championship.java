import java.util.Collection;
public class Championship {

    private Standing standing;

    public Championship(Standing standing) {
        this.standing = standing;
    }

    public void startChampionship() {
        generateStanding();
    }

    private void generateStanding() {
        Collection<Team> allTeams = TeamStorage.TEAM_STORAGE.getAllTeams();
    }
}
