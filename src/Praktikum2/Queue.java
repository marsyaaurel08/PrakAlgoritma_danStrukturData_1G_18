package Praktikum2;

public class Queue {
    Nasabah18[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new Nasabah18[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen Terdepan: " + data[front].norek + " " + data[front].nama + " " +
                    data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen Paling Belakang: " + data[rear].norek + " " + data[rear].nama
                    + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            int count = 0;
            while (count < size) {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " +
                        data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
                count++;
            }
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void Enqueue(Nasabah18 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh!");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah18 Dequeue() {
        Nasabah18 dt = null;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return dt;
    }
}
