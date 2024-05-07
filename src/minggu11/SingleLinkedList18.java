package minggu11;

public class SingleLinkedList18 {
    Node18 head, tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            Node18 tmp = head;
            System.out.print("Isi Linked List:");
            while(tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(int input){
        Node18 ndInput = new Node18(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input){
        Node18 ndInput = new Node18(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input){
        Node18 ndInput = new Node18(input, null);
        Node18 temp = head;
        while(temp != null){
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, int input){
        if(index < 0){
            System.out.println("Indeks tidak valid");
            return;
        }
        if(index == 0){
            addFirst(input);
        } else {
            Node18 temp = head;
            for(int i = 0; i < index - 1 && temp != null; i++){
                temp = temp.next;
            }
            if(temp == null){
                System.out.println("Indeks melebihi panjang linked list");
                return;
            }
            temp.next = new Node18(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }
}
