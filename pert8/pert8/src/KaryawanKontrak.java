public interface KaryawanKontrak {
    // Abstract Method (Wajib diimplementasikan)
    double hitungGaji(int jamKerja);
    void perpanjangKontrak(int durasiBulan);

    // Default Method (Opsional di-override)
    default String getStatusCuti() {
        return "Tersedia 12 hari"; // Standar karyawan tetap
    }
}