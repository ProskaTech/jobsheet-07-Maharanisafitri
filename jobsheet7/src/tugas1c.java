/*
 created by 21343008_Maharani Safitri
 */
import java.util.Scanner;
public class tugas1c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah = 0;
        do {
            System.out.println(nama);
            jumlah++;
        } while (jumlah < 100);
    }
}
