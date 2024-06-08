package Jobsheet12;

public class GraphMatriks18 {
    int vertex;
    int [][] matriks;

    public GraphMatriks18(int v){
        vertex = v;
        matriks = new int[v][v];
    }
    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }
    public void removeEdgeM(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
        matriks[tujuan][asal] = 0; 
    }
    public void printGraphM() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != 0) {
                    System.out.print("Gedung " + (char) ('A' + j) + "("+ matriks[i][j]+ "m), ");
                } else {
                    System.out.print("Gedung " + (char) ('A' + j) + "(0m), ");
                }
            }
            System.out.println("");
        }
    }
}
