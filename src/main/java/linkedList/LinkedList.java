package linkedList;

class Iterator<T> {
    LinkedList.Node<T> headNode;
    public boolean hasNext() {
        return headNode != null;
    }

    public T next() {
        T data = headNode.data;
        headNode = headNode.next;
        return data;
    }
}
public class LinkedList<T>{
    Node<T> headNode;
    int size;
    public LinkedList() {
        headNode = null;
        size = 0;
    }

    public Iterator<T> iterator() {
        Iterator<T> iter = new Iterator<>();
        iter.headNode = this.headNode;
        return iter;
    }

    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T d) {
            this.data = d;
            this.next = null;
        }
    }

    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        //add first element to head node
        if (headNode == null) {
            headNode = newNode;
        } else {
            Node<T> headNode = this.headNode; //headNode is a local variable
            while (headNode.next != null) {
                headNode = headNode.next;
            }
            headNode.next = newNode;
        }
        size++;
    }

    public void remove(T element) {
         //headNode is a local variable
         for(int i = 0; i <= indexOf(element); i++) {
             Node<T> headNode = this.headNode;

             if (i == indexOf(element) && headNode.data.equals(element)) {
                 this.headNode = headNode.next;
                 size--;
             }
         }
    }
    public int indexOf(T element) {
        int index = 0;
        Node<T> headNode = this.headNode;
        while (headNode != null) {
            if (headNode.data.equals(element)) {
                return index;
            }
            index++;
            headNode = headNode.next;
        }
        return index;
    }

    @Override
    public String toString() {
        String result = "";
        Node<T> headNode = this.headNode; //headNode is a local variable
        while (headNode != null) {
            result += headNode.data;
            if (headNode.next != null) {
                result += ", ";
            }
            headNode = headNode.next;
        }

        return "[" + result + "]";
    }
}
