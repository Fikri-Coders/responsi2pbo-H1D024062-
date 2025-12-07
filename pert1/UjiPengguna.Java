class UjiPengguna {
    public static void main(String[] args) {
        // Data Uji: Umur 25, Berat 60, Tinggi 170
        Pengguna user1 = new Pengguna(25, 60, 170);

        user1.tampilInfo();

        // Demonstrasi Konstanta Final
        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + user1.faktorAktivitas);
        System.out.println("Jika kita paksa ubah nilai ini, compiler akan error:");
        System.out.println("'cannot assign a value to final variable faktorAktivitas'");
        
        // user1.faktorAktivitas = 1.5; // Baris ini error jika di-uncomment
    }
}