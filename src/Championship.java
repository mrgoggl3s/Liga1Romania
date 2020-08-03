import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Championship {

    Random random = new Random();
    private Standing standing;

    public Championship() {
        this.standing = new Standing();
    }

    public void startChampionship() {
        generateStanding();
    }

    private void generateStanding() {
        List<Team> allTeams = new ArrayList<>(TeamStorage.TEAM_STORAGE.getAllTeams());


        for (int i = 0; i < allTeams.size() - 1; i++) {
            standing.addRounds(new Round());
        }

        for (int i = 0; i < allTeams.size(); i++) {
            Team currentTeam = allTeams.get(i);
            List<Integer> allAvailableTeams = getAllAvailableTeams(allTeams);
            allAvailableTeams.remove(i);
            for (int nrEtapei = 0; nrEtapei < allTeams.size() - 1; nrEtapei++) {
                if (standing.getRounds().get(nrEtapei).getRound().stream().anyMatch(g -> g.containsTeam(currentTeam))) {
                    continue;
                }

                int randomAway = getRandomAway(allAvailableTeams.size());
                int awayIndex = allAvailableTeams.get(randomAway);
                Team awayTeam = allTeams.get(awayIndex);
                Team teamToCheck = new Team(awayTeam.getName());
                while (standing.getRounds().get(nrEtapei).getRound().stream().anyMatch(g -> g.containsTeam(teamToCheck))) {
                     randomAway = getRandomAway(allAvailableTeams.size());
                     awayIndex = allAvailableTeams.get(randomAway);
                     awayTeam = allTeams.get(awayIndex);
                }
                standing.getRounds().get(nrEtapei).addGame(currentTeam, awayTeam);
                allAvailableTeams.remove(randomAway);
            }
        }


        System.out.println(standing);
    }

    private List<Integer> getAllAvailableTeams(List<Team> allTeams) {
        List<Integer> availableTeams = new ArrayList<>();
        for (int j = 0; j < allTeams.size(); j++) {
            availableTeams.add(j);
        }
        return availableTeams;
    }


    private int getRandomAway(int size) {
        return random.nextInt(size);
    }
}
