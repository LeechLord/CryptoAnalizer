package ru.javarush.pastushkov.cryptoanalizer.commands;

import ru.javarush.pastushkov.cryptoanalizer.entity.Result;
import ru.javarush.pastushkov.cryptoanalizer.entity.ResultCode;

public class Decrypt implements Action{
    @Override
    public Result execute(String[] parameters) {
        return new Result("decode all right", ResultCode.OK);
    }
}
