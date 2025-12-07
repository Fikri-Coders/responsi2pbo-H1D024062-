public class Member extends Customer {
    // State tambahan khusus Member
    private int poin;
    private String level; // Silver, Gold, Platinum

    // Constructor
    public Member(String nama, String id, int totalBelanja, int poin, String level) {
        super(nama, id, totalBelanja);
        this.poin = poin;
        this.level = level;
    }

    // Override tampilkanInfo
    @Override
    public void tampilkanInfo() {
        // Panggil info dasar dari parent dulu
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poin + " | Level: " + level);
    }
}