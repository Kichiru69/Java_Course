package FirstCourse;

public class BankAccount {
  int id = 1;
  String name = "Petr";
  double balance = 100;

  void popolnenieScheta(double up) {
    System.out.println("До пополнения = " + balance);
    balance += up;
    System.out.println("После пополнения = " + balance);

  }
  void snytieSoScheta(double down) {
    System.out.println("До снятия = " + balance);
    balance -= down;
    System.out.println("После снятия = " + balance);

  }
}
