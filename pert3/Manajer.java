public class Manajer extends Karyawan {
    // State tambahan khusus Manajer
    private double tunjangan;

    // Constructor
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Override tampilInfo
    @Override
    public void tampilInfo() {
        super.tampilInfo(); 
        
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp " + (gajiPokok + tunjangan));
    }
}