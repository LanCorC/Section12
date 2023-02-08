package crg.rla.section12167;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team<T>> {
    private ArrayList<T> leagueRoster = new ArrayList<>(15);

    public void addTeam(T team) {
        if (leagueRoster.contains(team)) {
            System.out.println(team.getName() +
                    " is already registered.");
        } else {
            leagueRoster.add(team);
            System.out.println(team.getName() +
                    " has been registered.");
        }
    }

    public void printRated() {
        Collections.sort(leagueRoster);
        int count = 1;
        for (Team<T> team : leagueRoster) {
            System.out.printf("%2d: %-10s (%d)%n", count,
                    team.getName(), team.rankScore());
            count++;
        }
    }
}
