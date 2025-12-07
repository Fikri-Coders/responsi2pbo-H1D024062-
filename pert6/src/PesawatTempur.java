public class PesawatTempur extends KendaraanGalaksi {
    // Atribut Khusus
    private int jumlahRudal;

    // Constructor
    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    // Implementasi Abstract Method
    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin pesawat tempur tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan. Siap bertempur!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int energiDibutuhkan = jarak * 3; // Boros energi (3% per km)

        if (getLevelEnergi() >= energiDibutuhkan) {
            // Kurangi energi pakai setter
            setLevelEnergi(getLevelEnergi() - energiDibutuhkan);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiBaru = getLevelEnergi() + jumlah;
        if (energiBaru > 100) energiBaru = 100; // Cap di 100
        setLevelEnergi(energiBaru);
        System.out.println("Mengisi energi... Status kini: " + getLevelEnergi() + "%");
    }

    // Method Khusus
    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal! Sisa rudal: " + jumlahRudal);
        } else {
            System.out.println("Gagal menembak! Rudal habis atau tidak cukup.");
        }
    }
}