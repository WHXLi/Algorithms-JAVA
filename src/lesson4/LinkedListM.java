package lesson4;

public class LinkedListM<T> {

    // Элемент списка
    private static class Link<T> {
        private final T data;
        private Link<T> next;

        public Link(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Link<T> first = null;
    private Link<T> last = null;

    public void addFirst(T data) {
        long start = System.nanoTime();
        Link<T> newFirst = new Link<>(data);
        last = first;
        newFirst.next = first;
        first = newFirst;
        long finish = System.nanoTime();
        System.out.println("Добавление элемента в начало: " + newFirst + ". Время выполнения: " + (finish - start));
    }

    public void removeFirst() {
        long start = System.nanoTime();
        Link<T> oldFirst = first;
        first = first.next;
        long finish = System.nanoTime();
        System.out.println("Удаление элемента: " + oldFirst + ". Время выполнения: " + (finish - start));
    }

    public void insert(T data) {
        long start = System.nanoTime();
        Link<T> newLink = new Link<>(data);
        if (this.isEmpty()) first = newLink;
        else last.next = newLink;
        last = newLink;
        long finish = System.nanoTime();
        System.out.println("Добавление элемента в начало: " + newLink + ". Время выполнения: " + (finish - start));
    }

    public void delete() {
        long start = System.nanoTime();
        Link<T> temp = first;
        if (first.next == null) last = null;
        first = first.next;
        long finish = System.nanoTime();
        System.out.println("Удаление элемента: " + temp + ". Время выполнения: " + (finish - start));
    }

    @Override
    public String toString() {
        StringBuilder listBuilder = new StringBuilder();
        Link<T> currentLink = first;
        while (currentLink != null) {
            listBuilder.append(currentLink).append(", ");
            currentLink = currentLink.next;
        }
        if (listBuilder.length() > 2) {
            listBuilder.replace(0, 0, "[");
            listBuilder.delete(listBuilder.length() - 2, listBuilder.length());
            listBuilder.append("]");
        }
        return listBuilder.toString();
    }

    public boolean isEmpty() {
        return first == null;
    }
}
