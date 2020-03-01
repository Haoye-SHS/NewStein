package Java2.Class02;

public class MyNode<T> {
    T item;
    MyNode<T> next;

    public MyNode(T data) {
        item = data;
        next = null;
    }
}
