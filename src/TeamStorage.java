import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TeamStorage {

    private Map<String,Team> teamsByName;
    public static final TeamStorage TEAM_STORAGE = new TeamStorage();


    private TeamStorage() {
        teamsByName = new HashMap<>();
    }

    public void add(Team team) {
        if (!teamsByName.containsKey(team.getName())) {
            teamsByName.put(team.getName(), team);
        }
    }

    public Collection<Team> getAllTeams() {
        return teamsByName.values();
    }

    public Team getTeam(String nume) {
       return teamsByName.get(nume);
    }

    public void updateTeam(Team team) {
        teamsByName.put(team.getName(), team);

    }




}
