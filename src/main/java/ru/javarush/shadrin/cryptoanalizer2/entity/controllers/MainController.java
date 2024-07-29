package ru.javarush.shadrin.cryptoanalizer2.entity.controllers;

import ru.javarush.shadrin.cryptoanalizer2.entity.Result;
import ru.javarush.shadrin.cryptoanalizer2.entity.commands.Action;

public class MainController {

    public Result doAction(String actionName, String[] parameters) {
        // action == encode
        // parameters = [//encode text.txt encode.txt, 12]
        Action action = Actions.find(actionName);
        Result result = action.execute(parameters);
        return result;

    }
}

