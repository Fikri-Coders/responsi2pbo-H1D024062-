public class UjiCustomer {
    public static void main(String[] args) {
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // 1. Objek Customer Biasa
        Customer c1 = new Customer("Budi Santoso", "CST-001", 500000);
        System.out.println("\nStatus: Customer Biasa");
        c1.tampilkanInfo();

        // 2. Objek Member
        Member m1 = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");
        System.out.println("\nStatus: Member");
        m1.tampilkanInfo();
    }
}