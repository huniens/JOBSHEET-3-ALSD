import java.util.Scanner;
/**
 * PersegiPanjangDemo
 */
 public class PersegiPanjangDemo {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
            PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];
            int panjang, lebar;
            
            for (int i = 0; i < 3; i++) {
                arrayOfPersegiPanjang[i] = new PersegiPanjang();

                System.out.println("Persegi panjang ke-" + (i + 1));
                System.out.print("Masukkan panjang: ");
                panjang = input13.nextInt();
                System.out.print("Masukkan lebar: ");
                lebar = input13.nextInt();

                arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang,lebar);

                //System.out.print("Masukkan lebar: ");
                //arrayOfPersegiPanjang[i].lebar = input13.nextInt();
            }
        
            System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang[0].panjang + ", lebar: " + arrayOfPersegiPanjang[0].lebar);
            System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang + ", lebar: " + arrayOfPersegiPanjang[1].lebar);
            System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang[2].panjang + ", lebar: " + arrayOfPersegiPanjang[2].lebar);
        }
}
