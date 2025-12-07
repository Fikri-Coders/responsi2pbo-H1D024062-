public class Customer {
    // State
    protected String nama;
    protected String id;
    protected int totalBelanja;

    // Constructor
    public Customer(String nama, String id, int totalBelanja) {
        this.nama = nama;
        this.id = id;
        this.totalBelanja = totalBelanja;
    }

    // Method Info Dasar
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | ID: " + id + " | Total Belanja: Rp " + totalBelanja);
    }
}