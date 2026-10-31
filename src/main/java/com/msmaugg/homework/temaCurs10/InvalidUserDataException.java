package com.msmaugg.homework.temaCurs10;

/**
 * Exceptie verificata (checked), folosita pentru a semnala date invalide
 * la crearea/adaugarea unui utilizator.
 */
public class InvalidUserDataException extends Exception {

    public InvalidUserDataException(String message) {
        super(message);
    }
}