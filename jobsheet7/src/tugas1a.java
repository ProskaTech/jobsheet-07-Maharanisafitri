/*
 created by 21343008_Maharani Safitri
 */
import java.util.Scanner;
public class tugas1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah;
        for (jumlah = 0; jumlah < 100; jumlah += 1)
            System.out.println(nama);
    }
}

