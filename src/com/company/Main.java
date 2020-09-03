package com.company;

public class Main {

    /*  1)  Алгоритмы и структуры данных из жизни: начало движения на автомобиле, утренние гигиенические процедуры, заполнение школьного журнала.
     *  2)  Алгоритмы и структуры данных из программирования: массивы и сортировка, стеки и очереди, списки и итераторы. */
    private static MyClass myClass = new MyClass(4);

    public static void main(String[] args) {
        // Ссылочный тип
        Integer linkType = new Integer(4);
        //или
        Integer linkTypeCorrect = 4;

        // Примитивный тип
        int primal = 4;
        // Создаем массив местных переменных
        int[] array = {linkType, linkTypeCorrect, primal};

        // Абстрактный тип
        myClass.printAbstractType();

        //Сравниваем переменую абстрактного типа с нашими местными
        compareATD(array);
    }

    private static void compareATD(int[] array) {
        for (int i : array) {
            System.out.println("Результат сравнения " + (myClass.abstractType == i));
        }
        System.out.println("Время выполнения: " + System.nanoTime() + " наносек.");
    }
}
