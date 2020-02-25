package onlineTest.bny;

import java.util.ArrayList;
import java.util.List;

public class FootballScoreProblem {

    public static void main(String[] args) {

        List<Integer> teamA = new ArrayList<>();
        /*teamA.add(1);
        teamA.add(4);
        teamA.add(2);
        teamA.add(4);*/

        teamA.add(2);
        teamA.add(10);
        teamA.add(5);
        teamA.add(4);
        teamA.add(8);

        List<Integer> teamB = new ArrayList<>();
        /*teamB.add(3);
        teamB.add(5);*/

        teamB.add(3);
        teamB.add(1);
        teamB.add(7);
        teamB.add(8);

        List<Integer> count = counts(teamA, teamB);
        System.out.println("Count value:- "+ count);
    }

    private static List<Integer> counts(List<Integer> teamA, List<Integer> teamB) {

        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < teamB.size(); i++) {
            int countValue = 0;
            for (int j = 0; j < teamA.size(); j++) {
                if(teamB.get(i) >= teamA.get(j)){
                    countValue++;
                }
            }
            count.add(countValue);
        }

        return count;
    }
}
