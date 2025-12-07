public class UjiSDM {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");

        // 1. Buat Objek (Nama: Andi, Gaji/Jam: 50.000, PIN: 1234)
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        // 2. Pengujian Gaji & Cuti
        andi.hitungGaji(160); // 160 jam x 50.000
        System.out.println("Status Cuti: " + andi.getStatusCuti());

        // 3. Pengujian Login
        andi.login("9999"); // Tes PIN salah
        andi.login("1234"); // Tes PIN benar

        // 4. Pengujian Role
        System.out.println("Role Akses: " + andi.getRoleAkses());

        // 5. Kontrak & Logout
        andi.perpanjangKontrak(6);
        andi.logout();
    }
}