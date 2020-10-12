package lesson4;

public class StackM<T> {
    private final LinkedListM<T> list;

    public StackM() {
        list = new LinkedListM<>();
    }

    public StackM(LinkedListM<T> list) {
        this.list = list;
    }

    public void push(T data) {
        list.addFirst(data);
    }

    public void pop() {
        list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Стэк: " + list.toString();
    }
}
