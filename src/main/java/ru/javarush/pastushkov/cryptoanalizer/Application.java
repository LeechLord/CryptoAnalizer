package ru.javarush.pastushkov.cryptoanalizer;

import ru.javarush.pastushkov.cryptoanalizer.controllers.MainController;
import ru.javarush.pastushkov.cryptoanalizer.exception.AppException;

import javax.xml.transform.Result;
import java.util.Arrays;

public class Application {
    private final MainController mainController;


    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        //encode text.txt encoded.txt 12
        if (args.length > 0) {
            String action = args[0]; //encode
            // parameters - text.txt encode.txt 12
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);

            mainController.doAction(action, parameters);
        }
        throw new AppException();
    }
}
