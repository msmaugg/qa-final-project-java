package com.msmaugg.homework;

import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean valid;

        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();
            valid = false;

            // Regula 1: lungimea intre 6 si 12 caractere
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                System.out.println();
                continue;
            }

            // Regulile 2 si 3: parcurgem caracterele cu for
            boolean hasSpace = false;
            boolean hasDigit = false;
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if (c == ' ') {
                    hasSpace = true;
                    break; // nu mai verificam alte reguli pentru inputul curent
                }
                if (c >= '0' && c <= '9') {
                    hasDigit = true;
                }
            }

            if (hasSpace) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                System.out.println();
            } else if (!hasDigit) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                System.out.println();
            } else {
                valid = true;
            }
        } while (!valid);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}