public interface PaymentMethod {
    // Kontrak Method (Wajib diimplementasikan)
    String processPayment();
    String getPaymentDetails();
    double getTransactionFee();
    double getBalance();
}