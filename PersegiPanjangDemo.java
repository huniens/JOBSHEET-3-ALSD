import java.util.Scanner;
/**
 * PersegiPanjangDemo
 */
 public class PersegiPanjangDemo {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
            PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];
    
            arrayOfPersegiPanjang[0] = new PersegiPanjang();
            arrayOfPersegiPanjang[0].panjang = 110;
            arrayOfPersegiPanjang[0].lebar = 30;
    
            arrayOfPersegiPanjang[1] = new PersegiPanjang();
            arrayOfPersegiPanjang[1].panjang = 80;
            arrayOfPersegiPanjang[1].lebar = 40;
    
            arrayOfPersegiPanjang[2] = new PersegiPanjang();
            arrayOfPersegiPanjang[2].panjang = 100;
            arrayOfPersegiPanjang[2].lebar = 20;
            
            System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang[0].panjang + ", lebar: " + arrayOfPersegiPanjang[0].lebar);
            System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang + ", lebar: " + arrayOfPersegiPanjang[1].lebar);
            System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang[2].panjang + ", lebar: " + arrayOfPersegiPanjang[2].lebar);

            for (int i = 0; i < 3; i++) {
                arrayOfPersegiPanjang[i] = new PersegiPanjang();

                System.out.println("Persegi panjang ke-" + (i + 1));
                System.out.print("Masukkan panjang: ");
                arrayOfPersegiPanjang[i].panjang = input13.nextInt();

                System.out.print("Masukkan lebar: ");
                arrayOfPersegiPanjang[i].lebar = input13.nextInt();
            }
            for (int i = 0; i < 3; i++){
                System.out.println("Persegi panjang ke-" + (i + 1) + ":");
            arrayOfPersegiPanjang[i].cetakInfo();
            System.out.println(); // Tambahkan baris kosong antar persegi panjang
            }
        } 
        
}
