import java.util.Scanner;

public class Data1_1 {

    static Scanner scanner = new Scanner(System.in);

    static String[] judulPaket = {
        "SUNRISE HUNTER BROMO",
        "SOUTH MALANG BEACH HOPPING",
        "EXPLORE FUN KOTA BATU",
        "JOGJA ISTIMEWA GETAWAY (3 HARI 2 MALAM)"
    };

    static String[] deskripsiPaket = {
        "Nikmati keindahan matahari terbit keemasan dari puncak Pananjakan dengan latar belakang gagahnya Gunung Bromo, Batok, dan Semeru.",
        "Jelajahi surga tersembunyi di pesisir selatan Malang. Dari pantai dengan pura di atas karang hingga pantai dengan ombak yang tenang.",
        "Habiskan hari penuh tawa dan keseruan di Kota Batu! Pilih taman rekreasi favoritmu dan abadikan momen di spot-spot foto yang Instagramable.",
        "Selami kekayaan budaya Jawa di kota Yogyakarta. Dari kemegahan candi kuno hingga keramaian jalan Malioboro yang legendaris."
    };

    static String[][] aktivitasPaket = {
        {
            "Penjemputan dari Malang (tengah malam).",
            "Perjalanan dengan Jeep 4x4 menuju Pananjakan.",
            "Menikmati momen matahari terbit (sunrise).",
            "Turun ke lautan pasir dan mendaki kawah Bromo.",
            "Mengunjungi Pasir Berbisik dan Bukit Teletubbies."
        },
        {
            "Penjemputan dari Malang (pagi hari).",
            "Mengunjungi Pantai Balekambang (Little Tanah Lot).",
            "Mengunjungi Pantai Goa Cina.",
            "Menikmati sunset sebelum kembali ke Malang."
        },
        {
            "Penjemputan dari Malang.",
            "Kunjungan ke theme park pilihan: Jatim Park 2 atau Jatim Park 3.",
            "Mengunjungi Museum Angkut.",
            "Singgah di Alun-Alun Kota Batu dan Pos Ketan Legenda."
        },
        {
            "Hari 1: Perjalanan Malang - Jogja, check-in, wisata malam di Malioboro.",
            "Hari 2: Mengunjungi Candi Borobudur, Keraton Yogyakarta, dan Taman Sari.",
            "Hari 3: Belanja oleh-oleh, mengunjungi Candi Prambanan, kembali ke Malang."
        }
    };

    static String[] hargaPaket = {
        "Mulai dari Rp 350.000/orang",
        "Mulai dari Rp 250.000/orang",
        "Mulai dari Rp 300.000/orang",
        "Mulai dari Rp 950.000/orang"
    };

    static String[] fasilitasPaket = {
        "Transportasi Jeep 4x4, Tiket masuk, Driver/Pemandu, Masker.",
        "Transportasi AC (Mobil), Tiket masuk semua pantai, Driver, Air mineral.",
        "Transportasi AC, Tiket masuk untuk 2 destinasi pilihan, Driver.",
        "Transportasi Kereta Api/Travel, Akomodasi hotel 2 malam, Transportasi lokal, Tiket masuk wisata."
    };

    public static void main(String[] args) {
        boolean lanjut = true;

        while (lanjut) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            if (pilihan >= 1 && pilihan <= 4) {
                tampilkanDetailPaket(pilihan - 1);
                lanjut = !konfirmasi();
            } else if (pilihan == 0) {
                System.out.println("===== TERIMAKASIH TELAH MENGGUNAKAN FILKOM TRAVEL ;^) =====");
                break;
            } else {
                System.out.println("PILIHAN TIDAK TERSEDIA");
            }
        }

        scanner.close();
    }

    static void tampilkanMenu() {
        System.out.println("\nMenu Paket Wisata:");
        for (int i = 0; i < judulPaket.length; i++) {
            System.out.println((i + 1) + " : " + judulPaket[i]);
        }
        System.out.println("0 : Keluar");
        System.out.print("Masukkan pilihan anda : ");
    }

    static void tampilkanDetailPaket(int indeks) {
        System.out.println("\n--- DETAIL PAKET: " + judulPaket[indeks] + " ---");
        System.out.println("Deskripsi: " + deskripsiPaket[indeks]);
        System.out.println("\nItinerary / Aktivitas:");
        for (String aktivitas : aktivitasPaket[indeks]) {
            System.out.println("- " + aktivitas);
        }
        System.out.println("\nHarga: " + hargaPaket[indeks]);
        System.out.println("\nFasilitas: " + fasilitasPaket[indeks]);
    }

    static boolean konfirmasi() {
        String jawaban;
        do {
            System.out.print("Apakah kamu yakin ? (Y/n) : ");
            jawaban = scanner.nextLine();
            if (jawaban.equalsIgnoreCase("Y")) {
                System.out.println("===== TERIMAKASIH TELAH MENGGUNAKAN FILKOM TRAVEL ;^) =====");
                return true;
            } else if (jawaban.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("MASUKAN ANDA TIDAK VALID");
            }
        } while (!jawaban.equalsIgnoreCase("Y") && !jawaban.equalsIgnoreCase("n"));
        return false;
    }
}