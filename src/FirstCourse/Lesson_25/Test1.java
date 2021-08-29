package FirstCourse.Lesson_25;

public class Test1 {
  public static void main(String[] args) {
    Animal a1 = new Lev("Animal Lev");
    Animal a2 = new Mechenosec("Animal Mech");
    Animal a3 = new Pingvin("Animal Pin");
    Fish f1 = new Mechenosec("Fish Mech");
    Bird b1 = new Pingvin("Bird Pin");
    Lev l1 = new Lev("Levik");
    Mammal m1 = new Lev("Mammal Lev");
    Mechenosec me1 = new Mechenosec("Mech");
    Pingvin p1 = new Pingvin("Pingvin");
    Speakable s1 = new Lev("Speakable Lev");
    Speakable s2 = new Pingvin("Speakable Pin");

    Speakable[] speakable = new Speakable[]{s1,s2,l1,b1,m1,p1};
    Animal[] animals = new Animal[]{a1,a2,a3,f1,b1,l1,m1,me1,p1};

    System.out.println(a1.equals(l1));

    for (Speakable sp: speakable) {
      if (sp instanceof Lev) {
        ((Lev) sp).eat();
        ((Lev) sp).sleep();
        ((Lev) sp).run();
        sp.speak();
      } else if (sp instanceof Pingvin) {
        ((Pingvin) sp).eat();
        ((Pingvin) sp).sleep();
        sp.speak();
        ((Pingvin) sp).fly();
      }
    }
    for (Animal a:animals) {
      if (a instanceof Lev) {
        Lev l = (Lev) a;
        l.eat();
        l.run();
        l.speak();
        l.sleep();
        System.out.println(a.name);
      } else if(a instanceof Mechenosec) {
        a.eat();
        a.sleep();
        ((Mechenosec) a).swim();
      } else if (a instanceof Pingvin) {
        a.eat();
        a.sleep();
        ((Pingvin) a).speak();
        ((Pingvin) a).fly();
      }
    }
  }
}

abstract class Animal {
  Animal(String name) {
    this.name = name;
  }

  String name;

  abstract void eat();

  abstract void sleep();
}

abstract class Fish extends Animal {
  Fish(String name) {
    super(name);
    this.name = name;
  }

  @Override
  void sleep() {
    System.out.println("Vsegda interesno nablydat kak sleeps fish "+name);
  }

  abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
  Bird(String name) {
    super(name);
    this.name = name;
  }

  abstract void fly();

  @Override
  public void speak() {
    System.out.println(name + " sings");
  }
}

abstract class Mammal extends Animal implements Speakable {
  Mammal(String name) {
    super(name);
    this.name = name;
  }

  abstract void run();
}

interface Speakable {
  default void speak() {
    System.out.println("Somebody speaks");
  }
}

class Mechenosec extends Fish {
  Mechenosec(String name) {
    super(name);
    this.name = name;
  }

  @Override
  void swim() {
    System.out.println("Mechenoset bistro plavaet " + name);
  }

  @Override
  void eat() {
    System.out.println("Mechenoset est korm "+name);
  }
}

class Pingvin extends Bird{
  Pingvin(String name) {
    super(name);
    this.name = name;
  }

  @Override
  void eat() {
    System.out.println("Pingvin loves fish "+name);
  }

  @Override
  void sleep() {
    System.out.println("Pingvini sleeps close to another "+name);
  }

  @Override
  void fly() {
    System.out.println("Pingvin ne umeet letat "+name);
  }

  @Override
  public void speak() {
    System.out.println("Pingvins don't sing "+name);
  }
}

class Lev extends Mammal{
  Lev(String name) {
    super(name);
    this.name = name;
  }

  @Override
  void eat() {
    System.out.println(name + " Lev lubit meat");
  }

  @Override
  void sleep() {
    System.out.println(name + " Lev loves sleep");
  }

  @Override
  void run() {
    System.out.println(name + " Lev ne samii bistriy");
  }
}
