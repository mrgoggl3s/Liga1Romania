public class Application {

    public static void main(String[] args) {
        Team cfr = new Team("CFR");
        Team craiova = new Team("U.Craiova");
        Team astra = new Team("Astra");
        Team botosani = new Team("Botosani");
        Team botosani1 = new Team("Dinamo");
        Team botosani2 = new Team("Rapid");
        Team botosani3 = new Team("Mioveni");
        Team botosani4 = new Team("Arges");
        Team botosani5 = new Team("Slatina");


        TeamStorage.TEAM_STORAGE.add(cfr);
        TeamStorage.TEAM_STORAGE.add(craiova);
        TeamStorage.TEAM_STORAGE.add(astra);
        TeamStorage.TEAM_STORAGE.add(botosani);
        TeamStorage.TEAM_STORAGE.add(botosani1);
        TeamStorage.TEAM_STORAGE.add(botosani2);
        TeamStorage.TEAM_STORAGE.add(botosani3);
        TeamStorage.TEAM_STORAGE.add(botosani4);
        TeamStorage.TEAM_STORAGE.add(botosani5);

        Championship championship = new Championship();
        championship.startChampionship();

    }
}
