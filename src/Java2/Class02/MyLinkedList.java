package Java2.Class02;

public class MyLinkedList<T> {
    private int size;
    private MyNode head;

    // Define Constructor
    public MyLinkedList() {
        size = 0;
        head = null;
    }

    //getter and setter


    //add first
    public void addFirst(T item){
        MyNode<T> temp = new MyNode<>(item);
        temp.next = head;
        head = (MyNode)item;
        size++;
    }

    public void addLast(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        MyNode<T> temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        size++;
    }

    public void insertBefore(T item, int position) {
        if (position == 1) {
            addFirst(item);
            return;
        }

        MyNode<T> newNode = new MyNode<>(item);
        MyNode<T> temp = head;
        position = position--;
        int count = 0;

        while(count < position) {
            temp = temp.next;
            count++;
        }

        MyNode<T> temp2 = temp.next;
        temp.next = newNode;
        newNode.next = temp2;
        size++;
    }

    public void insertAfter(T item, int position) {

    }
}
