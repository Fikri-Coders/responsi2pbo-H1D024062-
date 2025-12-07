public class UjiKaryawan {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // 1. Objek Karyawan Biasa
        Karyawan karyawan1 = new Karyawan("Budi Santoso", 4000000);
        System.out.println("\nStatus: Karyawan Biasa");
        karyawan1.tampilInfo();

        // 2. Objek Manajer
        Manajer manajer1 = new Manajer("Siti Aminah", 6000000, 2500000);
        System.out.println("\nStatus: Manajer");
        manajer1.tampilInfo();
    }
}