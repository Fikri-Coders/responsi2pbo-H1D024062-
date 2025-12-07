public class UjiBarang {
    public static void main(String[] args) {
        // 1. Buat objek Gitar (Hanya Kode dan Nama) - Pakai Constructor 1
        BarangMusik gitar = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        // 2. Update Data Gitar
        gitar.ubahHarga(1500000.0);
        gitar.tambahStok(5);

        // 3. Buat objek Drum (Data Lengkap) - Pakai Constructor 3
        BarangMusik drum = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);

        // 4. Tampilkan Informasi
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}
