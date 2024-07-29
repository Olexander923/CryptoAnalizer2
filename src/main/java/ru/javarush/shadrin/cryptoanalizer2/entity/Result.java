package ru.javarush.shadrin.cryptoanalizer2.entity;

public class Result {

   private final String message;

   private final ResultCode resultCode;

    public Result(String message, ResultCode resultCode) {
        this.message = message;
        this.resultCode = resultCode;
    }

   @Override
   public String toString() {
      return "Result{" +
              "message='" + message + '\'' +
              ", resultCode=" + resultCode +
              '}';
   }
}
// или все-таки class ??!