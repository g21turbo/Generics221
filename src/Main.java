public class Main {

    public static void main(String[] args) {

        FootballPlayer bob = new FootballPlayer("bob");
        BaseballPlayer joe = new BaseballPlayer("joe");
        SoccerPlayer jim = new SoccerPlayer("jim");


        Team americanEagles = new Team("American Eagles");
        americanEagles.addPlayer(bob);
        americanEagles.addPlayer(joe);
        americanEagles.addPlayer(jim);
        System.out.println(americanEagles.numPlayers() + " players on the team.");




    }

}
