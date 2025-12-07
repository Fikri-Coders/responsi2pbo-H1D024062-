public class UjiGalaksi {
    public static void main(String[] args) {
        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");

        // 1. PENGUJIAN PESAWAT TEMPUR
        System.out.println("\n--- PESAWAT TEMPUR ---");
        PesawatTempur fighter = new PesawatTempur("Astra-Fury", 2, 8);

        fighter.aktifkanMesin();
        fighter.jelajah(10);
        fighter.jelajah(30); // Butuh 90% energi (Pasti Gagal karena sisa 70%)
        fighter.tembakRudal(3);
        fighter.tampilStatus();

        // 2. PENGUJIAN KAPAL EKSPLORASI
        System.out.println("\n--- KAPAL EKSPLORASI ---");
        KapalEksplorasi explorer = new KapalEksplorasi("Voyager X", 10, 4);

        explorer.aktifkanMesin();
        explorer.jelajah(15);
        explorer.scanPlanet("Kepler-442b");
        explorer.tampilStatus();
    }
}