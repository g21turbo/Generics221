public class Main {

    public static void main(String[] args) {

        FootballPlayer bob = new FootballPlayer("bob");
        BaseballPlayer joe = new BaseballPlayer("joe");
        SoccerPlayer jim = new SoccerPlayer("jim");

        //Changed type, list only accepts football players
        Team<FootballPlayer> americanEagles = new Team<>("American Eagles");

        americanEagles.addPlayer(bob);
//        americanEagles.addPlayer(joe);
//        americanEagles.addPlayer(jim);

        System.out.println(americanEagles.numPlayers() + " players on the team.");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(joe);


        Team<SoccerPlayer> brokeTeam = new Team<>("United");
        brokeTeam.addPlayer(jim);

        Team<FootballPlayer> cowboys = new Team<>("Dallas Cowboys");
        FootballPlayer aikman = new FootballPlayer("Troy Aikman");
        FootballPlayer smith = new FootballPlayer("Emmitt Smith");
        FootballPlayer irvin = new FootballPlayer("Michael Irvin");

        Team<FootballPlayer> niners = new Team<>("San Francisco 49ers");
        FootballPlayer young = new FootballPlayer("Steve Young");
        FootballPlayer rice = new FootballPlayer("Jerry Rice");
        FootballPlayer sanders = new FootballPlayer("Deon Sanders");

        Team<FootballPlayer> practiceSquad = new Team<>("Cowboys Practice Squad");
        FootballPlayer moose = new FootballPlayer("Daryl Johnston");
        FootballPlayer novacek = new FootballPlayer("Jay Novacek");
        FootballPlayer holt = new FootballPlayer("Issaiac Holt");

        cowboys.matchResult(niners, 24, 17);
        niners.matchResult(cowboys, 0, 47);
        cowboys.matchResult(practiceSquad, 1, 1);


    }

}
