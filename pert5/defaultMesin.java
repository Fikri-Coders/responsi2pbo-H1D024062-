public class defaultMesin {
    // State
    String namaMesin;
    int tenagaHP;

    // Constructor
    public defaultMesin(String namaMesin, int tenagaHP) {
        this.namaMesin = namaMesin;
        this.tenagaHP = tenagaHP;
    }

    // Method Info Dasar
    void tampilInfo() {
        System.out.println("Mesin " + namaMesin + " | Tenaga: " + tenagaHP + " HP");
    }

    // Method Performa (Default)
    double nilaiPerforma() {
        return tenagaHP * 1.0;
    }

    // Method Kategori (Default)
    String kategoriMesin() {
        return "Mesin Umum";
    }
}