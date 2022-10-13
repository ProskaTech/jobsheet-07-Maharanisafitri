/*
 created by 21343008_Maharani Safitri
 */
public class Nestedloop {
    public static void main(String[] args) {
        int baris, kolom = 0, hasil_akhir;
        int MAKS = 8;
        
        for (baris = 1; kolom <=MAKS; baris++)
        {
            int maks = 0;
            for (kolom = 1; kolom <= maks; kolom++)
            {
                int hasil_kali = baris * kolom;
                System.out.println("\t" + hasil_kali);
                } 
            System.out.println("");
        }
    }
}
