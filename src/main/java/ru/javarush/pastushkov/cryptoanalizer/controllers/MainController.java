package ru.javarush.pastushkov.cryptoanalizer.controllers;

import ru.javarush.pastushkov.cryptoanalizer.commands.Action;
import ru.javarush.pastushkov.cryptoanalizer.entity.Result;

public class MainController {
    public Result doAction(String actionName, String[] parameters){
        // action == encode
        // parameters == [text.txt, encode.txt. 12]
        Action action = Actions.find(actionName);
        Result result = action.execute(parameters);
        return result;
    }
}
