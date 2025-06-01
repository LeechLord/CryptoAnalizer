package ru.javarush.pastushkov.cryptoanalizer.controllers;

import ru.javarush.pastushkov.cryptoanalizer.commands.Action;
import ru.javarush.pastushkov.cryptoanalizer.commands.Decrypt;
import ru.javarush.pastushkov.cryptoanalizer.commands.Encrypt;
import ru.javarush.pastushkov.cryptoanalizer.exception.AppException;

public enum Actions {
    ENCODE(new Encrypt()),
    DECODE(new Decrypt());

    private final Action action;


    Actions(Action action) {
        this.action = action;
    }

    public static Action find (String actionName){
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppException("not found " + actionName, e);
        }
    }
}
