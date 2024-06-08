package Jobsheet12;

public class Node18 {
    int data;
    int jarak;
    Node18 prev;
    Node18 next;

    public Node18(Node18 prev, int data, int jarak, Node18 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
