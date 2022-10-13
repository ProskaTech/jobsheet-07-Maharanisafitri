/*
 created by 21343008_Maharani Safitri
 */
import java.util.Scanner;
public class tugas1b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah = 0;

        while (jumlah < 100) {
            System.out.println(nama);
            jumlah++;
        }
    }
}
