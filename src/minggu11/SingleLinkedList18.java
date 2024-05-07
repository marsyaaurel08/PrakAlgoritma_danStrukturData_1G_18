package minggu11;

public class SingleLinkedList18 {
    Node18 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node18 tmp = head;
            System.out.print("Isi Linked List:");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node18 ndInput = new Node18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node18 ndInput = new Node18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node18 ndInput = new Node18(input, null);
        Node18 temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (index == 0) {
            addFirst(input);
            return;
        }
        Node18 temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Indeks melebihi panjang linked list");
            return;
        }
        temp.next = new Node18(input, temp.next);
        if (temp.next.next == null) {
            tail = temp.next;
        }
    }

    int getData(int index) {
        Node18 tmp = head;
        for (int i = 0; i <= index && tmp != null; i++) {
            if (i == index) {
                return tmp.data;
            }
            tmp = tmp.next;
        }
        throw new IndexOutOfBoundsException("Indeks melebihi panjang linked list");
    }
    
    int indexOf(int key) {
        Node18 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return index;
        } else {
            return -1;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            if (isEmpty()) {
                System.out.println("Linked list kosong");
            }
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Linked list kosong");
        } else {
            Node18 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            if (head.data == key) {
                removeFirst();
                return;
            }
            Node18 temp = head;
            while (temp.next != null) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Data tidak ditemukan dalam linked list");
        }
    }

    void removeAt(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node18 temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Indeks melebihi panjang linked list");
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }
}
