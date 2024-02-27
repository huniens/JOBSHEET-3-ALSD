/**
 * PersegiPanjang
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;

    // Konstruktor default
    public PersegiPanjang() {
        // Default constructor
    }

    // Konstruktor khusus
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method untuk mencetak informasi persegi panjang
    public void cetakInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
