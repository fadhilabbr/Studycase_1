import java.util.Scanner;

public class Data1_1 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
         boolean check = true;
         do {
            System.out.println("Menu : ");
            System.out.println("1 : SUNRISE HUNTER BROMO");
            System.out.println("2 : SOUTH MALANG BEACH HOPPING ");
            System.out.println("3 : EXPLORE FUN KOTA BATU ");
            System.out.println("4 : JOGJA ISTIMEWA GETAWAY (3 HARI 2 MALAM)");
            System.out.println("0 : keluar");

            System.out.print("Masukkan pilihan anda : ");
            int pil = input.nextInt();

            if (pil == 1){
                System.out.println("\n--- DETAIL PAKET: SUNRISE HUNTER BROMO ---");
                System.out.println("Deskripsi: Nikmati keindahan matahari terbit keemasan dari puncak Pananjakan dengan latar belakang gagahnya Gunung Bromo, Batok, dan Semeru.");
                System.out.println("\nItinerary/Aktivitas:");
                System.out.println("- Penjemputan dari Malang (tengah malam).");
                System.out.println("- Perjalanan dengan Jeep 4x4 menuju Pananjakan.");
                System.out.println("- Menikmati momen matahari terbit (sunrise).");
                System.out.println("- Turun ke lautan pasir dan mendaki kawah Bromo.");
                System.out.println("- Mengunjungi Pasir Berbisik dan Bukit Teletubbies.");
                System.out.println("\nHarga: Mulai dari Rp 350.000/orang");
                System.out.println("\nFasilitas: Transportasi Jeep 4x4, Tiket masuk, Driver/Pemandu, Masker.");

                input.nextLine();
                
                String cek = "";
                do{
                    System.out.print("Apakah kamu yakin ?(Y/n) : ");
                    cek = input.nextLine();
                    if (cek.equalsIgnoreCase("Y")) {
                        System.out.println("===== TERIMAKASIH TELAH MENGGUNAKAN FILKOM TRAVEL ;^) =====");
                        check = false;
                    } else if(cek.equalsIgnoreCase("n")){
                        check = true;
                        break;
                    } else {
                        System.out.println("MASUKAN ANDA TIDAK VALID");
                    }
                } while(!cek.equalsIgnoreCase("Y") && !cek.equalsIgnoreCase("L"));
            }

            else if (pil == 2){
                System.out.println("\n--- DETAIL PAKET: SOUTH MALANG BEACH HOPPING ---");
                System.out.println("Deskripsi: Jelajahi surga tersembunyi di pesisir selatan Malang. Dari pantai dengan pura di atas karang hingga pantai dengan ombak yang tenang.");
                System.out.println("\nItinerary/Aktivitas:");
                System.out.println("- Penjemputan dari Malang (pagi hari).");
                System.out.println("- Mengunjungi Pantai Balekambang (Little Tanah Lot).");
                System.out.println("- Mengunjungi Pantai Goa Cina.");
                System.out.println("- Menikmati sunset sebelum kembali ke Malang.");
                System.out.println("\nHarga: Mulai dari Rp 250.000/orang");
                System.out.println("\nFasilitas: Transportasi AC (Mobil), Tiket masuk semua pantai, Driver, Air mineral.");

                input.nextLine();
                
                String cek = "";
                do{
                    System.out.print("Apakah kamu yakin ?(Y/n) : ");
                    cek = input.nextLine();
                    if (cek.equalsIgnoreCase("Y")) {
                        System.out.println("===== TERIMAKASIH TELAH MENGGUNAKAN FILKOM TRAVEL ;^) =====");
                        check = false;
                    } else if(cek.equalsIgnoreCase("n")){
                        check = true;
                        break;
                    } else {
                        System.out.println("MASUKAN ANDA TIDAK VALID");
                    }
                } while(!cek.equalsIgnoreCase("Y") && !cek.equalsIgnoreCase("L"));
            }

            else if (pil == 3){
                System.out.println("\n--- DETAIL PAKET: EXPLORE FUN KOTA BATU ---");
                System.out.println("Deskripsi: Habiskan hari penuh tawa dan keseruan di Kota Batu! Pilih taman rekreasi favoritmu dan abadikan momen di spot-spot foto yang Instagramable.");
                System.out.println("\nItinerary/Aktivitas:");
                System.out.println("- Penjemputan dari Malang.");
                System.out.println("- Kunjungan ke theme park pilihan: Jatim Park 2 atau Jatim Park 3.");
                System.out.println("- Mengunjungi Museum Angkut.");
                System.out.println("- Singgah di Alun-Alun Kota Batu dan Pos Ketan Legenda.");
                System.out.println("\nHarga: Mulai dari Rp 300.000/orang");
                System.out.println("\nFasilitas: Transportasi AC, Tiket masuk untuk 2 destinasi pilihan, Driver.");
                
                input.nextLine();
                
                String cek = "";
                do{
                    System.out.print("Apakah kamu yakin ?(Y/n) : ");
                    cek = input.nextLine();
                    if (cek.equalsIgnoreCase("Y")) {
                        System.out.println("===== TERIMAKASIH TELAH MENGGUNAKAN FILKOM TRAVEL ;^) =====");
                        check = false;
                    } else if(cek.equalsIgnoreCase("n")){
                        check = true;
                        break;
                    } else {
                        System.out.println("MASUKAN ANDA TIDAK VALID");
                    }
                } while(!cek.equalsIgnoreCase("Y") && !cek.equalsIgnoreCase("L"));
            }
            else if (pil == 4){
                System.out.println("\n--- DETAIL PAKET: JOGJA ISTIMEWA GETAWAY (3 HARI 2 MALAM) ---");
                System.out.println("Deskripsi: Selami kekayaan budaya Jawa di kota Yogyakarta. Dari kemegahan candi kuno hingga keramaian jalan Malioboro yang legendaris.");
                System.out.println("\nItinerary/Aktivitas:");
                System.out.println("- Hari 1: Perjalanan Malang - Jogja, check-in, wisata malam di Malioboro.");
                System.out.println("- Hari 2: Mengunjungi Candi Borobudur, Keraton Yogyakarta, dan Taman Sari.");
                System.out.println("- Hari 3: Belanja oleh-oleh, mengunjungi Candi Prambanan, kembali ke Malang.");
                System.out.println("\nHarga: Mulai dari Rp 950.000/orang");
                System.out.println("\nFasilitas: Transportasi Kereta Api/Travel, Akomodasi hotel 2 malam, Transportasi lokal, Tiket masuk wisata.");
                
                input.nextLine();
                
                String cek = "";
                do{
                    System.out.print("Apakah kamu yakin ?(Y/n) : ");
                    cek = input.nextLine();
                    if (cek.equalsIgnoreCase("Y")) {
                        System.out.println("===== TERIMAKASIH TELAH MENGGUNAKAN FILKOM TRAVEL ;^) =====");
                        check = false;
                    } else if(cek.equalsIgnoreCase("n")){
                        check = false;
                        break;
                    } else {
                        System.out.println("MASUKAN ANDA TIDAK VALID");
                    }
                } while(!cek.equalsIgnoreCase("Y") && !cek.equalsIgnoreCase("L"));
            }
            else if (pil == 0){
                System.out.println("===== TERIMAKASIH TELAH MENGGUNAKAN FILKOM TRAVEL ;^) =====");
                break;
            } else {
                System.out.println("PILIHAN TIDAK TERSEDIA");
            }

         } while (check == true);
         input.close();
    }
}