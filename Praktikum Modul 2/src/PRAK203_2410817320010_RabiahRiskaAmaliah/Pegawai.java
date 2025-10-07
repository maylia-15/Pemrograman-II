package PRAK203_2410817320010_RabiahRiskaAmaliah;

//Baris ini error karena nama class nya salah, seharusnya Pegawai bukan Employee
//public class Employe
public class Pegawai {
    public String nama;

    //baris ini error karena tipe data char hanya dapat menampung 1 huruf
    //public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama(){
        return nama;
    }

    public String getAsal(){
        return asal;
    }

//    baris ini error karena methode tidak memiliki parameter dan variabel "j" tidak didefinisikan
//    public void setJabatan(){
//        this.jabatan = j;
//    }
    public void setJabatan(String j){
        this.jabatan = j;
    }
}
