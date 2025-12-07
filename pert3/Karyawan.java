public class Karyawan {
    // State (gunakan protected agar bisa diakses subclass Manajer)
    protected String nama;
    protected double gajiPokok;

    // Constructor
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method Info Dasar
    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }
}