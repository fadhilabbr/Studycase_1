import java.util.Scanner;

public class Data1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Jumlahpenumpang;
        String Destinasi = "";
        System.out.println("SELAMAT DATANG DI FILKOM TRAVEL\n PADA MAU KEMANA NIHH???");
        Destinasi = input.next();
        System.out.print("MASUKKAN JUMLAH PENUMPANG : ");
        Jumlahpenumpang = input.nextInt();
        
        for(int i = 1; i <= Jumlahpenumpang; i++){
            String NAMA, NO_TELP, ALAMAT;
            System.out.println("MASUKKAN DATA DIRI ANDA");
            System.out.print("NAMA : ");
            NAMA = input.nextLine();
            System.out.print("NO. TELP : ");
            NO_TELP = input.nextLine();
            System.out.print("ALAMAT : ");
            ALAMAT = input.nextLine();
            input.nextLine();
        }
        input.close();
    }
}
