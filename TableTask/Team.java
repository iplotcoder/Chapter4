package TableTask;


/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private Athlete[] players;
   

    /**
     * Constructor for objects of class Team
     */
    public Team(String tn, int size)
    {
        // initialise instance variables
        this.teamName = tn;
        this.players = new Athlete[size];
    }
    
    public void addAthlete(int index, Athlete a) {
        players[index] = a;
    }
    
    public String toString() {
        String output = "The members of the tea, are: \n";
        for(Athlete a : players) {
            output += a + "\n";
        }
        return output;
    }
}
