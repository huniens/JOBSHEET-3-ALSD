import java.util.Scanner;

// Class Ruangan untuk menyimpan informasi ruangan
class Ruangan {
    String namaRuangan;
    String fasilitas;
    int kapasitas;
    boolean statusPesan;
    String pemesan;

    Ruangan(String namaRuangan, String fasilitas, int kapasitas) {
        this.namaRuangan = namaRuangan;
        this.fasilitas = fasilitas;
        this.kapasitas = kapasitas;
        this.statusPesan = false;
        this.pemesan = "";
    }

    // Menampilkan informasi ruangan
    void tampilkanInfo() {
        System.out.println("\nInformasi Ruangan:");
        System.out.println("Nama Ruangan: " + namaRuangan);
        System.out.println("Fasilitas: " + fasilitas);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Status Pemesanan: " + (statusPesan ? "Sudah dipesan" : "Belum dipesan"));
        if (statusPesan) {
            System.out.println("Pemesan: " + pemesan);
        }
    }

    // Melakukan pemesanan ruangan
    void pesanRuangan(String namaPemesan) {
        if (!statusPesan) {
            statusPesan = true;
            pemesan = namaPemesan;
            System.out.println("Ruangan berhasil dipesan oleh " + namaPemesan);
        } else {
            System.out.println("Ruangan sudah dipesan oleh " + pemesan + ". Pemesanan gagal.");
        }
    }

    // Membatalkan pemesanan ruangan
    void batalkanPemesanan() {
        if (statusPesan) {
            statusPesan = false;
            pemesan = "";
            System.out.println("Pemesanan ruangan berhasil dibatalkan.");
        } else {
            System.out.println("Ruangan belum dipesan. Pembatalan pemesanan gagal.");
        }
    }
}