package crg.rla.section12167;

public abstract class Team<T extends Team<T>> implements Comparable<Team<T>>{
    protected String name;
    private int plays = 0;
    private int wins = 0;
    private int ties = 0;
    private int losses = 0;

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }

    public void matchResult(T team, int ourScore, int theirScore) {
        plays++;
        if (ourScore > theirScore) {
            wins++;
            if (team != null) {
                System.out.println(getName() + " won against " + team.getName());
            }
        } else if(ourScore < theirScore) {
            losses++;
            if (team != null) {
                System.out.println(getName() + " lost to " + team.getName());
            }
        } else {
            ties++;
            if (team != null) {
                System.out.println(getName() + " tied with " + team.getName());
            }
        }
        if (team != null) { //loop back once, swap values
            team.matchResult(null, theirScore, ourScore);
        }
    }

    public int rankScore() {
//        System.out.println("Ties: " + ties + ", Wins: " + wins + ", Losses: " + losses);
        return ((wins * 2) + ties);
    }

    @Override
    public int compareTo(Team<T> o) {
        return Integer.compare(o.rankScore(), rankScore());

//        if (o.rankScore() > rankScore()) {
//            return 1;
//        } else if(rankScore() > o.rankScore()) {
//            return -1;
//        } else {
//            return 0;
//        }
//        JAVA recommended Integer.compare(), but here remains my origin
        //-al implementation
    }
}

class LolTeam extends Team<LolTeam> {

    public LolTeam(String name) {
        super(name);
    }

}

class FrisbeeTeam extends Team<FrisbeeTeam> {

    public FrisbeeTeam(String name) {
        super(name);
    }
}

class TfTeam extends Team<TfTeam> {

    public TfTeam(String name) {
        super(name);
    }
}