public class analisisMesin {
    public static void main(String[] args) {
        // 1. Buat array Polimorfik
        defaultMesin[] inventaris = new defaultMesin[5];

        // 2. Isi array dengan berbagai objek
        inventaris[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventaris[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        inventaris[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        inventaris[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        inventaris[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        // Loop Polimorfik
        for (defaultMesin m : inventaris) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        // Loop Downcasting untuk method unik
        for (defaultMesin m : inventaris) {
            if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            } else if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        // Logika Max Value
        defaultMesin maxMesin = inventaris[0];
        for (int i = 1; i < inventaris.length; i++) {
            if (inventaris[i].nilaiPerforma() > maxMesin.nilaiPerforma()) {
                maxMesin = inventaris[i];
            }
        }
        System.out.println(maxMesin.namaMesin + " -> " + maxMesin.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        // Sorting Manual (Bubble Sort Descending)
        for (int i = 0; i < inventaris.length - 1; i++) {
            for (int j = 0; j < inventaris.length - i - 1; j++) {
                if (inventaris[j].nilaiPerforma() < inventaris[j + 1].nilaiPerforma()) {
                    // Tukar posisi
                    defaultMesin temp = inventaris[j];
                    inventaris[j] = inventaris[j + 1];
                    inventaris[j + 1] = temp;
                }
            }
        }

        // Tampilkan 3 Teratas
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + inventaris[i].namaMesin + " -> " + inventaris[i].nilaiPerforma());
        }
    }
}