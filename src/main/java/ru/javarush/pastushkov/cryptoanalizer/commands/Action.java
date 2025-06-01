package ru.javarush.pastushkov.cryptoanalizer.commands;

import ru.javarush.pastushkov.cryptoanalizer.entity.Result;

public interface Action {
    Result execute (String[] parameters);
}
