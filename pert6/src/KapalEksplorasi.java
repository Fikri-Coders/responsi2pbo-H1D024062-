public class KapalEksplorasi extends KendaraanGalaksi {
    // Atribut Khusus
    private int modulScan; // Level 1-5

    // Constructor
    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat! Sistem scan online.");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int energiDibutuhkan = jarak * 2; // Lebih hemat (2% per km)

        if (getLevelEnergi() >= energiDibutuhkan) {
            setLevelEnergi(getLevelEnergi() - energiDibutuhkan);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Gagal menjelajah! Energi kritis.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiBaru = getLevelEnergi() + jumlah;
        if (energiBaru > 100) energiBaru = 100;
        setLevelEnergi(energiBaru);
        System.out.println("Panel surya terbuka. Energi terisi menjadi " + getLevelEnergi() + "%");
    }

    // Method Khusus
    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}