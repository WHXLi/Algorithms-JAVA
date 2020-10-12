package lesson4;

import lesson1.MyClass;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // 4.1 и 4.5 На основе данных объектного списка из задания 3.4 реализуйте простой стек и его базовые методы.
        //Оцените время выполнения операций с помощью базового метода System.nanoTime().
        System.out.println("\nЗадание 4.1\n");
        LinkedListM<Integer> linkedList = new LinkedListM<>();
        linkedList.addFirst(new MyClass(1).getAbstractType());
        linkedList.addFirst(new MyClass(2).getAbstractType());
        linkedList.addFirst(new MyClass(3).getAbstractType());
        StackM<Integer> stack = new StackM<>(linkedList);
        stack.push(0);
        stack.pop();
        System.out.println(stack.toString());
        while (!stack.isEmpty()) {
            stack.pop();
        }
        System.out.println(stack.toString());

        // 4.2 На основе данных объектного списка из задания 3.4 реализуйте простую очередь и его базовые методы.
        //Реализуйте вспомогательные методы.
        //Оцените время выполнения операций с помощью базового метода System.nanoTime().
        System.out.println("\nЗадание 4.2\n");
        QueueM<Integer> queue = new QueueM<>();
        queue.insert(new MyClass(1).getAbstractType());
        queue.insert(new MyClass(2).getAbstractType());
        queue.insert(new MyClass(3).getAbstractType());
        System.out.println(queue.toString());
        queue.delete();
        System.out.println(queue.toString());

        // 4.3 и 4.5 На основе данных объектного списка из задания 3.4 реализуйте простой дек и его базовые методы.
        //Оцените время выполнения операций с помощью базового метода System.nanoTime().

    }
}
