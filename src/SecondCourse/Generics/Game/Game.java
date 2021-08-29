package SecondCourse.Generics.Game;

public class Game {
  public static void main(String[] args) {
    Pupils pupils1 = new Pupils(15, "Vlad");
    Pupils pupils2 = new Pupils(14, "Olya");
    Pupils pupils3 = new Pupils(13, "Katya");
    Team<Pupils> t1 = new Team<>("Anime");
    t1.addParticipant(pupils1);
    t1.addParticipant(pupils2);
    t1.addParticipant(pupils3);
    Team<Employee> t2 = new Team<>("MTG");
    Employee employee1 = new Employee(25, "Lida");
    Employee employee2 = new Employee(30, "Mila");
    Employee employee3 = new Employee(27, "Aska");
    t2.addParticipant(employee1);
    t2.addParticipant(employee2);
    t2.addParticipant(employee3);
    Pupils pupils4 = new Pupils(15, "Vlad");
    Pupils pupils5 = new Pupils(14, "Olya");
    Team<Pupils> t3 = new Team<>("LOL");
    t3.addParticipant(pupils5);
    t3.addParticipant(pupils4);
    t1.getWinner(t3);
    System.out.println(t1.participantsList);
  }
}
