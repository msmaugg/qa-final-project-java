package com.msmaugg.homework.temaCurs10;

public class Main {

    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        // 1. User valid
        try {
            repository.addUser(new User("testuser", 25));
            System.out.println("Utilizator adaugat cu succes: testuser");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        // 2. AdminUser valid
        try {
            repository.addUser(new AdminUser("admin", 30, "full_access"));
            System.out.println("Administrator adaugat cu succes: admin");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        // 3. Username prea scurt
        try {
            repository.addUser(new User("ab", 22));
            System.out.println("Utilizator adaugat cu succes: ab");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugarea utilizatorului 'ab': " + e.getMessage());
        }

        // 4. Varsta negativa
        try {
            repository.addUser(new User("baduser", -5));
            System.out.println("Utilizator adaugat cu succes: baduser");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare la adaugarea utilizatorului 'baduser': " + e.getMessage());
        }

        // Afisam utilizatorii valizi adaugati
        System.out.println("\nUtilizatori existenti in repository:");
        for (User user : repository.getUsers()) {
            System.out.println(" - " + user);
        }
    }
}
