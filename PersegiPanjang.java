/**
 * InnerPersegiPanjang
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public int Luas;
    public int keliling;

    // Konstruktor berparameter
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        hitungLuas();
        hitungKeliling();
    }

    // Method untuk menghitung luas
    public void hitungLuas() {
        Luas = panjang * lebar;
    }

    // Method untuk menghitung keliling
    public void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }
    
    // Method untuk mencetak informasi persegi panjang
    public void cetakInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + Luas);
        System.out.println("Keliling: " + keliling);
    }
}
