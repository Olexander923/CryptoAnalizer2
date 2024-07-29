package ru.javarush.shadrin.cryptoanalizer2;

import ru.javarush.shadrin.cryptoanalizer2.entity.Result;
import ru.javarush.shadrin.cryptoanalizer2.entity.controllers.MainController;
import ru.javarush.shadrin.cryptoanalizer2.exceptions.AppException;

import java.util.Arrays;


public class Application {

    private MainController mainController;
    public Application() {
        mainController = new MainController();

}
public Result run(String[] args)  {
    //encode text.txt encode.txt 12
        if(args.length>0) {
            String action = args[0];
            //parameters - text.txt encode.txt 12
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);

            Result result = mainController.doAction(action, parameters);
        }
   throw new AppException();
    }
}