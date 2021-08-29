package SecondCourse.Generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participants> {
   private final String teamName;

   public Team(String teamName) {
      this.teamName = teamName;
   }

   public String getTeamName() {
      return teamName;
   }

   List<T> participantsList = new ArrayList<>();

   void addParticipant(T p) {
      participantsList.add(p);
      System.out.println("Add " + p.getName());
   }

   void getWinner(Team<T> team) {
      Random r = new Random();
      if (r.nextInt(2) == 0) {
         System.out.println("Team " + team.getTeamName() + " wins!");
      } else {
         System.out.println("Team " + this.teamName + " wins!");
      }
   }
}
