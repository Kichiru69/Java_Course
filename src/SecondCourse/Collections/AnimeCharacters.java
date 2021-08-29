package SecondCourse.Collections;

import java.util.Objects;

abstract class Characters {
  String sex;

  abstract void run();
  void eat() {
    System.out.println("Is sleeping");
  }
}

public class AnimeCharacters extends Characters implements Comparable<AnimeCharacters> {
  @Override
  public String toString() {
    return "AnimeCharacters{" +
            ", name='" + name + '\'' +
            ", power=" + power +
            '}';
  }

  private String name;
  private String fandom;
  private int power;

  public AnimeCharacters(String name, String fandom, int power) {
    this.name = name;
    this.fandom = fandom;
    this.power = power;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFandom() {
    return fandom;
  }

  public void setFandom(String fandom) {
    this.fandom = fandom;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  @Override
  public int compareTo(AnimeCharacters o) {
    int res = this.power - o.power;
    if (res == 0) {
     res = this.name.compareTo(o.name);
    }
    return res;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnimeCharacters that = (AnimeCharacters) o;
    return power == that.power && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, power);
  }

  @Override
  void run() {
    System.out.println(name + " is running");
  }
}

class HeroCharacters extends AnimeCharacters {
  public HeroCharacters(String name, String fandom, int power) {
    super(name, fandom, power);
  }

  @Override
  void run() {
    System.out.println("Hero is here!");
  }
}
