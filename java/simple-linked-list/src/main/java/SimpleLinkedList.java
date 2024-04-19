import java.lang.reflect.Array;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {

    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
            this.next =  null;
        }
    }

    SimpleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    SimpleLinkedList(T[] values) {

        Node<T> linkedList = null;

        for(T value: values){
            Node<T> newNode = new Node<>(value);
            if(head == null){

                head = newNode;
                this.size++;
                linkedList = head;

            }else{

                linkedList.next = newNode;
                this.size++;
                linkedList = linkedList.next;
            }
        }
    }

    void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        this.size++;
    }

    T pop() {
        if(head == null){
            throw new NoSuchElementException();
        }
        T data = head.data;
        head = head.next;
        this.size--;

        return data;
    }

    void reverse() {
        if(head == null || head.next == null){
            return;
        }
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    T[] asArray(Class<T> clazz) {
        T[] array = (T[]) Array.newInstance(clazz,this.size);
        if(this.size == 0){
            return array;
        }

        Node<T> current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        return array;
    }

    int size() {
        return this.size;
    }


}
