package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //SEZIONE NOME
        //Chiedere all'utente il suo Nome
        System.out.println("Qual'è il tuo nome?");
        //Salvare l'input dell'utente come "name"
        String name = scanner.nextLine();


        //SEZIONE COGNOME
        //Chiedere all'utente il suo Cognome
        System.out.println("Qual'è il tuo cognome?");
        //Salvare l'input dell'utente come "surname"
        String surname = scanner.nextLine();


        //SEZIONE COLORE
        //Chiedere all'utente il suo Colore Preferito
        System.out.println("Qual'è il tuo colore preferito?");
        //Salvare l'input dell'utente come "color"
        String color = scanner.nextLine();


        //SEZIONE GIORNO DI NASCITA
        //Chiedere all'utente il giorno in cui è nato
        System.out.println("Che giorno sei nato?");
        //Salvare l'input dell'utente come numero intero "day"
        int day = scanner.nextInt();


        //SEZIONE MESE DI NASCITA
        //Chiedere all'utente il mese in cui è nato
        System.out.println("Che mese sei nato?");
        //Salvare l'input dell'utente come numero intero "month"
        int month = scanner.nextInt();


        //SEZIONE ANNO DI NASCITA
        //Chiedere all'utente l'anno di nascita
        System.out.println("Qual'è il tuo anno di nascita?");
        //Salvare l'input dell'utente come numero intero "year"
        int year = scanner.nextInt();

        //Utlizzare i dati immessi dall'utente per generare la password
        String password = name + "-" + surname + "-" + color + "-" + (day+month+year);

        //Stampare su terminale la password
        System.out.println(password);

    }
}
