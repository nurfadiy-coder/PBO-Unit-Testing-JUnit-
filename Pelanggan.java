public class Pelanggan {
    private String nama;
    private String email;
    private String noTelepon;

    public Pelanggan(String nama, String email, String noTelepon) {
        this.nama = nama;
        this.email = email;
        this.noTelepon = noTelepon;
    }

    @Override 
    public String toString() {
        return nama + "," + email + "," + noTelepon;
    }
}
