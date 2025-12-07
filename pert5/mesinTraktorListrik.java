public class mesinTraktorListrik extends mesinTraktor {
    // State khusus
    double kapasitasBaterai;

    // Constructor
    public mesinTraktorListrik(String namaMesin, int tenagaHP, double kapasitasTarik, double kapasitasBaterai) {
        super(namaMesin, tenagaHP, kapasitasTarik);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Traktor Listrik " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | Baterai: " + kapasitasBaterai + " kWh | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Rumus khusus traktor listrik
        return (tenagaHP * 1.1) + (kapasitasBaterai * 5);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        System.out.println(namaMesin + " -> Bzzzzz! Mesin traktor listrik aktif!");
    }
}