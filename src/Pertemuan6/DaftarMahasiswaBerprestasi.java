package Pertemuan6;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa18 listMhs[] = new Mahasiswa18[5];
    int idx;

void tambah(Mahasiswa18 m){
    if (idx<listMhs.length){
        listMhs[idx] = m;
        idx++;
    } else{
        System.out.println("Data sudah penuh! !");
    }
}
void tampil(){
    for(Mahasiswa18 m : listMhs){
        m.tampil();
        System.out.println("------------------");

    }
}
void bubbleSort(){
    for(int i=0; i<listMhs.length-1; i++){
        for (int j=1;j<listMhs.length-i; j++ ){
            if(listMhs[j].ipk>listMhs[j-1].ipk){
                Mahasiswa18 tmp = listMhs[j];
                listMhs[j] = listMhs[j-1];
                listMhs[j-1] = tmp;
            }
        }
    }
}
void selectionSort(){
    for(int i =0; i<listMhs.length; i++){
        int idxMin = i;
        for(int j = i+1; j<listMhs.length; j++){
            if(listMhs[j].ipk < listMhs [idxMin].ipk){
                idxMin = j;
            }
        }
        Mahasiswa18 tmp = listMhs[idxMin];
        listMhs[idxMin] = listMhs[i];
        listMhs[i]= tmp;
    }
    }
}

