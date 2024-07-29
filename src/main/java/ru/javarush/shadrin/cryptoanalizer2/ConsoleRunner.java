package ru.javarush.shadrin.cryptoanalizer2;
import ru.javarush.shadrin.cryptoanalizer2.entity.Result;


public class ConsoleRunner {
    public static void main(String[] args) {
        //encode text.txt encode.txt 12
        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);
    }
}


//int key = 123; //<<<< args
//String text = "Привед медвед"; //<<<< args
//String result = "........."; //<<<< args