package PRAK203_2410817320010_RabiahRiskaAmaliah;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
//        baris ini error karena tidak ada ";"
//        p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

//        tambahan agar sesuai dengan output yang diminta
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
