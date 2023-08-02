package org.example;

public class Dog {

    String name;
    String rasa;
    int age;
    boolean feeal;
    public Dog(String name, String rasa, int age, boolean feeal) {
        this.name = name;
        this.rasa = rasa;
        this.age = age;
        this.feeal = feeal;
    }
    public String getSeek() {
        if (!feeal) {
            return "Sanatos";
        } else {
            return "Bolnav";
        }
    }

    String stare = getSeek();

    public String getBark() {
        if (stare == "Sanatos") {
            return ("Cainele se numeste " + this.name + " este rasa " + this.rasa + " si are varsta de " + this.age + " ani si face woof");
        } else {
            return ("Cainele se numeste " + this.name + " este rasa " + this.rasa + " si are varsta de " + this.age + " ani si NU face woof");
        }
    }
}
