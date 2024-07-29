package ru.javarush.shadrin.cryptoanalizer2.entity.controllers;

import ru.javarush.shadrin.cryptoanalizer2.entity.commands.Action;
import ru.javarush.shadrin.cryptoanalizer2.entity.commands.Decoder;
import ru.javarush.shadrin.cryptoanalizer2.entity.commands.Encoder;
import ru.javarush.shadrin.cryptoanalizer2.exceptions.AppException;

public enum Actions {
    ENCODE(new Encoder());
    DECODE(new Decoder());

    private final Action action;
    Actions(Encoder action) {
        this.action = action;
    }


        public static Action find(String actionName) {
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;

        } catch (IllegalArgumentException e) {
            throw new AppException();
        }
}
}
