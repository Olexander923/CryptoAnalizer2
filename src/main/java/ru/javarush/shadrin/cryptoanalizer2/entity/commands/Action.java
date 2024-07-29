package ru.javarush.shadrin.cryptoanalizer2.entity.commands;

import ru.javarush.shadrin.cryptoanalizer2.entity.Result;

public interface Action {

    Result execute(String[] parameters);
}
