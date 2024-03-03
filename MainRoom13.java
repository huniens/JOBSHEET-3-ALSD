import java.util.Scanner;
/**
 * MainRoom13
 */
public class MainRoom13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah ruangan
        System.out.print("Masukkan jumlah ruangan: ");
        int jumlahRuangan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Membuat array of objects Ruangan
        Room13[] room13s = new Room13[jumlahRuangan];

        // Input informasi ruangan dan inisialisasi array of objects
        for (int i = 0; i < jumlahRuangan; i++) {
            System.out.println("\nInput informasi ruangan ke-" + (i + 1));
            System.out.print("Nama Ruangan: ");
            String namaRuangan = scanner.nextLine();
            System.out.print("Fasilitas: ");
            String fasilitas = scanner.nextLine();
            System.out.print("Kapasitas: ");
            int kapasitas = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            room13s[i] = new Room13(namaRuangan, fasilitas, kapasitas);
        }

        // Menampilkan informasi ruangan
        for (Room13 ruangan : room13s) {
            ruangan.tampilkanInfo();
        }

        // Input pemesanan ruangan
        System.out.println("\nPemesanan Ruangan:");
        System.out.print("Masukkan nama pemesan: ");
        String namaPemesan = scanner.nextLine();
        System.out.print("Masukkan nomor ruangan yang akan dipesan: ");
        int nomorRuangan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Memanggil metode pesanRuangan pada objek yang dipilih
        room13s[nomorRuangan - 1].pesanRuangan(namaPemesan);

        // Menampilkan informasi ruangan setelah pemesanan
        room13s[nomorRuangan - 1].tampilkanInfo();

        // Membatalkan pemesanan ruangan
        System.out.println("\nPembatalan Pemesanan Ruangan:");
        System.out.print("Masukkan nomor ruangan yang akan dibatalkan pemesanannya: ");
        nomorRuangan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Memanggil metode batalkanPemesanan pada objek yang dipilih
        room13s[nomorRuangan - 1].batalkanPemesanan();

        // Menampilkan informasi ruangan setelah pembatalan pemesanan
        room13s[nomorRuangan - 1].tampilkanInfo();
    }
}