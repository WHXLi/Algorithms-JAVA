package lesson3;

import lesson1.MyClass;

import java.util.*;

public class Main {
    private static long start;
    private static final Integer[] INTEGERS = new Integer[5];
    private static final Double[] DOUBLES = new Double[5];
    private static ArrayList<Integer> integerArrayList;
    private static ArrayList<Double> doubleArrayList;
    private static LinkedList<Integer> integerLinkedList;
    private static LinkedList<Double> doubleLinkedList;

    public static void main(String[] args) {
        // 3.1
        System.out.println("\nЗадание 3.1\n");
        setArrays();
        integerArrayList = createList(INTEGERS);
        doubleArrayList = createList(DOUBLES);
        printAllArrayList();
        // 3.2
        System.out.println("\nЗадание 3.2\n");
        addInList(integerArrayList, 5000);
        addInList(doubleArrayList, 5.500);
        printAllArrayList();
        addInList(integerArrayList, 1, 1000);
        getFromList(integerArrayList, 1);
        removeIndexFromList(integerArrayList, 0);
        print(integerArrayList);
        removeValueFromList(integerArrayList, 1000);
        print(integerArrayList);
        // 3.3
        System.out.println("\nЗадание 3.3\n");
        MyLinkedList<String> list = new MyLinkedList<>();
        list.insert("Alina");
        list.insert("Vsevolod");
        list.display();
        System.out.println(list.find("Alina") + " найден");
        // 3.4 и 3.5
        System.out.println("\nЗадание 3.4\n" );
        integerLinkedList = createLinkedList(INTEGERS);
        doubleLinkedList = createLinkedList(DOUBLES);
        printAllLinkedList();
        addInList(integerLinkedList, 5, 666);
        removeIndexFromList(integerLinkedList, 4);
        getFromList(integerLinkedList, 4);
        print(integerLinkedList);
        System.out.println("\nСписок из объектов задания 1.3 и задание 3.5\n");
        LinkedList<MyClass> myClassLinkedList = new LinkedList<>();
        myClassLinkedList.add(new MyClass(1));
        myClassLinkedList.add(new MyClass(2));
        myClassLinkedList.add(new MyClass(3));
        print(myClassLinkedList);
        createIterator(myClassLinkedList);
    }

    private static void startTimer() {
        start = System.nanoTime();
    }

    private static void finishTimer() {
        long finish = System.nanoTime();
        System.out.println("Время выполнения: " + (finish - start) + " наносек.");
    }

    private static void printAllArrayList() {
        print(integerArrayList);
        print(doubleArrayList);
    }

    private static void printAllLinkedList(){
        print(integerLinkedList);
        print(doubleLinkedList);
    }

    private static <T> void print(List<T> list) {
        System.out.println(list);
    }

    private static void setArrays() {
        for (int i = 0; i < INTEGERS.length; i++) {
            INTEGERS[i] = new Random().nextInt(100);
        }
        for (int i = 0; i < DOUBLES.length; i++) {
            DOUBLES[i] = new Random().nextDouble();
        }
    }

    private static <T> ArrayList<T> createList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    private static <T> LinkedList<T> createLinkedList(T[] array){
        return new LinkedList<>(Arrays.asList(array));
    }

    private static <T> void addInList(List<T> arrayList, T value) {
        startTimer();
        arrayList.add(value);
        System.out.println("Добавление в список " + value.getClass().getSimpleName() + " : " + value);
        finishTimer();
    }

    private static <T> void addInList(List<T> arrayList, int index, T value) {
        startTimer();
        arrayList.add(index, value);
        System.out.println("Добавление в список " + value.getClass().getSimpleName() + " : " + value + " в позицию " + index);
        finishTimer();
    }

    private static <T> void getFromList(List<T> arrayList, int index) {
        startTimer();
        System.out.println("Получение элемента из списка " +
                arrayList.get(index).getClass().getSimpleName() +
                " в позиции " +
                index +
                " : " +
                arrayList.get(index));
        finishTimer();
    }

    private static <T> void removeIndexFromList(List<T> arrayList, int index) {
        startTimer();
        System.out.println("Удаление элемента из списка " +
                arrayList.get(index).getClass().getSimpleName() +
                " в позиции " +
                index +
                " : " +
                arrayList.remove(index));
        finishTimer();
    }

    private static <T> void removeValueFromList(List<T> arrayList, T value) {
        startTimer();
        System.out.println("Удаление элемента из списка " +
                arrayList.get(0).getClass().getSimpleName() +
                " " +
                value);
        arrayList.remove(value);
        finishTimer();
    }

    private static void createIterator(List<MyClass> list){
        Iterator <MyClass> iterator = list.iterator();
        System.out.print("[ ");
        while (iterator.hasNext()){
            iterator.next().printAbstractType();
            iterator.remove();
        }
        System.out.println("]");
    }
}
