public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        // 1. Buat Objek (Nama: OVO, Saldo: 150000, Tagihan: 50000)
        EWalletPayment ewallet = new EWalletPayment("OVO", 150000, 50000);

        // 2. Tampilkan Saldo Awal
        System.out.println("Saldo awal: Rp " + ewallet.getBalance());

        // 3. Proses Pembayaran
        System.out.println("Memproses pembayaran sebesar Rp 50000...");
        String hasil = ewallet.processPayment(); // Panggil method interface
        System.out.println(hasil);

        // 4. Tampilkan Info Akhir
        System.out.println("Sisa saldo: Rp " + ewallet.getBalance());
        System.out.println(ewallet.getPaymentDetails());
    }
}