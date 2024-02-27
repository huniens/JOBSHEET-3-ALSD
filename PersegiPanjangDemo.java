import java.util.Scanner;

/**
 * PersegiPanjangDemo
 */
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegi = input13.nextInt();

        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jumlahPersegi];
        int panjang, lebar;

        for (int i = 0; i < jumlahPersegi; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = input13.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = input13.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < jumlahPersegi; i++) {
            System.out.println("Informasi Persegi panjang ke-" + (i + 1) + ":");
            arrayOfPersegiPanjang[i].cetakInfo();
            System.out.println(); // Tambahkan baris kosong antar persegi panjang
        }

        input13.close(); // Tutup scanner setelah digunakan
    }
}