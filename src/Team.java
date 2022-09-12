import java.awt.event.ActionListener;
import java.util.ArrayList;


//T is a bounded type parameter, all types must use parameters in Player class
public class Team <T extends Player> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;


    //ArrayList for Team members
    private ArrayList<T> members = new ArrayList<>();

    //Constructor
    public Team(String name) {
        this.name = name;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Add a player
    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    //Returns the size of the team(int)
    public int numPlayers() {
        return this.members.size();
    }

    //Determines match results based off passed scores
    public void matchResult(Team opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat the ";

        } else if (ourScore == theirScore) {
            tied++;
            message = " tied with the ";

        } else {
            lost++;
            message = " lost to the ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

}
