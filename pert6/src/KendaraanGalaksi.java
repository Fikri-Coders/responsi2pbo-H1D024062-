public abstract class KendaraanGalaksi {
    // 1. STATE private
    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    // 2. CONSTRUCTOR
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // Default energi penuh saat dibuat
    }

    // 3. GETTER & SETTER
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    // Setter protected agar hanya bisa diakses oleh subclass/package
    protected void setLevelEnergi(int levelEnergi) {
        this.levelEnergi = levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    // 4. METHOD BIASA
    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " awak");
    }

    // 5. ABSTRACT METHODS (Wajib di-Override anak)
    public abstract void aktifkanMesin();
    public abstract void jelajah(int jarak);
    public abstract void isiEnergi(int jumlah);
}