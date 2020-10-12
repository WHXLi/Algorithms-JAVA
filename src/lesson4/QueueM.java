package lesson4;

public class QueueM<T> {
    private final LinkedListM<T> list;

    public QueueM() {
        list = new LinkedListM<>();
    }

    public QueueM(LinkedListM<T> list) {
        this.list = list;
    }

    public void insert(T data) {
        list.insert(data);
    }

    public void delete() {
        list.delete();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Очередь: " + list.toString();
    }
}
