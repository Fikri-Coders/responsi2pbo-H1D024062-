public class EWalletPayment implements PaymentMethod {
    // State
    private String namaLayanan;
    private double saldo;
    private double nominalPembayaran;

    // Constructor
    public EWalletPayment(String namaLayanan, double saldo, double nominalPembayaran) {
        this.namaLayanan = namaLayanan;
        this.saldo = saldo;
        this.nominalPembayaran = nominalPembayaran;
    }

    // Implementasi Method Interface
    @Override
    public double getTransactionFee() {
        return 2000.0; // Biaya admin flat
    }

    @Override
    public double getBalance() {
        return saldo;
    }

    @Override
    public String processPayment() {
        double totalBiaya = nominalPembayaran + getTransactionFee();

        if (saldo >= totalBiaya) {
            saldo -= totalBiaya;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran dilakukan melalui " + namaLayanan +
                "\nNominal: Rp " + nominalPembayaran +
                "\nBiaya Admin: Rp " + getTransactionFee();
    }
}