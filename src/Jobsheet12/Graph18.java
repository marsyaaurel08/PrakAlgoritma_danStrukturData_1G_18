package Jobsheet12;

public class Graph18 {
    int vertex;
    DoubleLinkedList18[] list;

    public Graph18(int v) {
        vertex = v;
        list = new DoubleLinkedList18[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList18();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;

        // in-degree
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
            // out-degree
        for (int k = 0; k<list[asal].size(); k++){
            list[asal].get(k);
        }
        totalOut = list[asal].size();
        }

    
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        // Remove edge from asal to tujuan
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].remove(i);
                break;
            }
        }
        // Remove edge from tujuan to asal
        for (int i = 0; i < list[tujuan].size(); i++) {
            if (list[tujuan].get(i) == asal) {
                list[tujuan].remove(i);
                break;
            }
        }
    }
    

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m)");
                    if (j < list[i].size() - 1) {
                        System.out.print(", ");
                    } else {
                        System.out.print(",");
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
