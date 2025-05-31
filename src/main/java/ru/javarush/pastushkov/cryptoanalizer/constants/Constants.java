package ru.javarush.pastushkov.cryptoanalizer.constants;

public class Constants {
    private static final String rusUp = "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ.";
    private static final String engUp = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String cypher = "1234567890";
    private static final String symbols = "!@№#$%^:;&?*()-+=" ;
    public static final String ALPHABET = rusUp + rusUp.toLowerCase() +  engUp + engUp.toLowerCase() + cypher + symbols;

}
