package ru.javarush.shadrin.cryptoanalizer2.entity.constants;

import java.io.File;

public class Constans {
    private static final String rus = "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
    private static final String eng = "QWERTYUIOPASDFGJKLZXCVBNM";
    private static final String cypher = "0123456789";
    private static final String z = "!@#$%^&*()[]{}";
    private static final String APPHABET = rus+eng+rus.toLowerCase()+ eng.toLowerCase()+cypher+z;
    public static final String TXT_FOLDER=System.getProperty("user.dir")+ File.separator+"text"+File.separator;
}
