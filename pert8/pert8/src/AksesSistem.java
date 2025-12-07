public interface AksesSistem {
    // Abstract Method
    void login(String pin);
    void logout();

    // Default Method
    default String getRoleAkses() {
        return "Staff Biasa";
    }
}