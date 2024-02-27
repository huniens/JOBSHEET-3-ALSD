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

    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    // Method untuk menghitung luas
    //public int hitungLuas() {
        //return panjang * lebar;
    //}

    // Method untuk menghitung keliling
    //    return 2 * (panjang + lebar);
    //}

    // Method untuk mencetak informasi persegi panjang
    public void cetakInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        //System.out.println("Luas: " + hitungLuas());
        //System.out.println("Keliling: " + hitungKeliling());
    }
}
