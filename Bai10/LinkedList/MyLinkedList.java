package Bai10.LinkedList;

public class MyLinkedList {
    private  Node head;
    private  int numNodes;
    private  Node tail;

    public MyLinkedList(Object data) {
        head = new Node(data);
        tail = tail.next;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        tail = tail.next;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        tail = tail.next;
        numNodes++;
    }

    public void addLast(Object data){
        tail.next = new Node(data);
        tail = tail.next;
        numNodes++;
    }

    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }


}
