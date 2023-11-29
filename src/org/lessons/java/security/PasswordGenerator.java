package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String defaultName = "Frank";
        String defaultSurname = "Barrett";
        String defaultColor = "Violet";
        int defaultDay = 9;
        int defaultMonth = 4;
        int defaultYear = 1998;


        Scanner scanner = new Scanner(System.in);


        //Chiedere all'utente il suo Nome
        System.out.println("Qual'è il tuo nome?");

        String name = scanner.nextLine();


        //Chiedere all'utente il suo Cognome
        System.out.println("Qual'è il tuo cognome?");

        String surname = scanner.nextLine();


        //Chiedere all'utente il suo Colore Preferito
        System.out.println("Qual'è il tuo colore preferito?");

        String color = scanner.nextLine();


        //Chiedere all'utente il giorno in cui è nato
        System.out.println("Che giorno sei nato?");

        int day = scanner.nextInt();


        //Chiedere all'utente il mese in cui è nato
        System.out.println("Che mese sei nato?");

        int month = scanner.nextInt();


        //Chiedere all'utente l'anno di nascita
        System.out.println("Qual'è il tuo anno di nascita?");

        int year = scanner.nextInt();


        String password = name + "-" + surname + "-" + color + "-" + (day+month+year);

        System.out.println(password);

    }
}
