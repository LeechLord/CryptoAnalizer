package ru.javarush.pastushkov.cryptoanalizer.entity;

public class Result {
    private final String message;

    private final ResultCode resultCode;

    @Override
    public String toString() {
        return "Result{" +
                "message='" + message + '\'' +
                ", resultCode=" + resultCode +
                '}';
    }

    public Result(String message, ResultCode resultCode) {
        this.message = message;
        this.resultCode = resultCode;
    }
}
