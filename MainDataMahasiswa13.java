import java.util.ArrayList;
import java.util.Scanner;
/**
 * MainDataMahasiswa13
 */
public class MainDataMahasiswa13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        ArrayList<DataMahasiswa13> daftarMahasiswa = new ArrayList<>();

        int jumlahMahasiswa;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input13.nextInt();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            DataMahasiswa13 mahasiswa = new DataMahasiswa13();

            System.out.print("Masukkan nama: ");
            mahasiswa.setNama(input13.next());

            System.out.print("Masukkan NIM: ");
            mahasiswa.setNim(input13.next());

            System.out.print("Masukkan jenis kelamin: ");
            mahasiswa.setJenisKelamin(input13.next());

            System.out.print("Masukkan IPK: ");
            mahasiswa.setIpk(input13.nextDouble());

            daftarMahasiswa.add(mahasiswa);
        }

        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + daftarMahasiswa.get(i).getNama());
            System.out.println("NIM: " + daftarMahasiswa.get(i).getNim());
            System.out.println("Jenis Kelamin: " + daftarMahasiswa.get(i).getJenisKelamin());
            System.out.println("IPK: " + daftarMahasiswa.get(i).getIpk());
        }

        // Menghitung rata-rata IPK
        double totalIpk = 0;
        for (DataMahasiswa13 mahasiswa : daftarMahasiswa) {
            totalIpk += mahasiswa.getIpk();
        }
        double rataRataIpk = totalIpk / daftarMahasiswa.size();

        System.out.println("\nRata-rata IPK: " + rataRataIpk);
    }
}