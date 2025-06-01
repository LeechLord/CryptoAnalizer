package ru.javarush.pastushkov.cryptoanalizer;

import javax.xml.transform.Result;

public class ConsoleRunner {
    public static void main(String[] args) {
        //encode text.txt encode.txt 12

        Application application = new Application();
        Result result =  application.run(args);
        System.out.println(result);

    }
}

//        int key= 3; //получать ключ
//        String text = "Привет Медведь!";
//        String result = ".................";