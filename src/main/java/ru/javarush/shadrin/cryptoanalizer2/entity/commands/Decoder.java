package ru.javarush.shadrin.cryptoanalizer2.entity.commands;

import ru.javarush.shadrin.cryptoanalizer2.entity.Result;
import ru.javarush.shadrin.cryptoanalizer2.entity.ResultCode;

public class Decoder implements Action {
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        return new Result("decode all right", ResultCode.OK);
    }
}
