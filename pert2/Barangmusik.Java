public class BarangMusik {
    // State / Atribut
    String kodeBarang;
    String namaBarang;
    double harga;
    int stok;

    // Constructor 1: Hanya Kode dan Nama (Harga & Stok otomatis 0)
    public BarangMusik(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = 0.0;
        this.stok = 0;
    }

    // Constructor 2: Kode, Nama, dan Harga (Stok otomatis 0)
    public BarangMusik(String kodeBarang, String namaBarang, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = 0;
    }

    // Constructor 3: Data Lengkap
    public BarangMusik(String kodeBarang, String namaBarang, double harga, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    // Method Mutator (Mengubah Data)
    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    void tambahStok(int jumlah) {
        this.stok += jumlah; // Menambah stok yang ada
    }

    // Method Info
    void tampilInfo() {
        System.out.print("Alat musik " + namaBarang + " | ");
        System.out.print("Kode: " + kodeBarang + " | ");
        // Menampilkan harga tanpa format desimal panjang (opsional, pakai %.1f atau string biasa)
        System.out.print("Harga: Rp " + harga + " | ");
        System.out.println("Stok: " + stok + " unit");
    }
}
