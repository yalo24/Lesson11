package com.company;

public class MyExeption extends  ArrayIndexOutOfBoundsException {
    String message;
    MyExeption (String message){
        this.message=message;
    }
}
