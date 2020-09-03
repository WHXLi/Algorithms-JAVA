package com.company;

public class MyClass {
    public int abstractType;

    public MyClass(int abstractType) {
        this.abstractType = abstractType;
    }

    public void printAbstractType() {
        System.out.println("Печатаем поле АТД: " + abstractType);
    }

    public void compareATD(int[] array) {
        for (int i : array) {
            System.out.println("Результат сравнения " + (abstractType == i));
        }
        System.out.println("Время выполнения: " + System.nanoTime() + " наносек.");
    }
}

