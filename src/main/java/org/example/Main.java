package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog = getDog();
        System.out.print(dog.getBark());
    }



    public static Dog getDog() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String rasa = sc.nextLine();
        int age = sc.nextInt();
        boolean feeal = sc.hasNext();
        return new Dog(name, rasa, age, feeal);
    }
}

