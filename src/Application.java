public class Application {

    public static void main(String[] args) {
        Team cfr = new Team("CFR");
        Team craiova = new Team("U.Craiova");
        Team astra = new Team("Astra");
        Team botosani = new Team("Botosani");


        TeamStorage.TEAM_STORAGE.add(cfr);
        TeamStorage.TEAM_STORAGE.add(craiova);
        TeamStorage.TEAM_STORAGE.add(astra);
        TeamStorage.TEAM_STORAGE.add(botosani);

        Championship championship = new Championship();
        championship.startChampionship();

    }
}
