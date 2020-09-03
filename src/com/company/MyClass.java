package com.company;

public class MyClass {
    public int abstractType;
    public MyClass(int abstractType){
        this.abstractType = abstractType;
    }

    public void printAbstractType(){
        System.out.println("Печатаем поле АТД: " + abstractType);
    }

}
