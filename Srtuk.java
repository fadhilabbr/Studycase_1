import java.util.Scanner;

public class Srtuk {
    public static void main(String[] args) {

        // MASUKKA  INPUT DATA DARI USER
        Scanner input = new Scanner(System.in);
        String nama, travel, no_telp;
        int harga_tiket, diskon, total_bayar;
        System.out.println("MASUKKAN DATA PEMESANAN TIKET FILKOM TRAVEL");
        System.out.print("Nama Customer  : ");
        nama = input.nextLine();
        System.out.print("Travel         : ");
        travel = input.nextLine();
        System.out.print("No Telp        : ");
        no_telp = input.nextLine();
        System.out.print("Harga Tiket    : Rp ");
        harga_tiket = input.nextInt();
        total_bayar = harga_tiket - diskon;
        input.close();
        // CETAK STRUK PEMBAYARAN
        System.out.println("===================================");
        System.out.println("         STRUK PEMBAYARAN");
        System.out.println("          FILKOM TRAVEL");
        System.out.println("===================================");
        System.out.println("Nama Customer  : " + nama);
        System.out.println("Travel         : " + travel);
        System.out.println("No Telp        : " + no_telp);
        System.out.println("Harga Tiket    : Rp " + harga_tiket);
        System.out.println("Total Bayar    : Rp " + total_bayar);
        System.out.println("===================================");
        System.out.println("       Terima Kasih Atas");
        System.out.println("       Kepercayaan Anda");
        System.out.println("===================================");
    }
}

