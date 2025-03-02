//Scanner merupakan class yang didefinisikan oleh java.util.Scanner sehingga dapat dipanggil
// dengan menambahkan import java.util.Scanner; terlebih dahulu. Variabel input
// merupakan Objek dari scanner yang terbentuk dari System.in.
//Import java.util.scanner digunakan untuk membuat inputan
import java.util.Scanner;

public class HitungLuasPersegi {
    public static void main(String[] args) {
        //Buat objek Scannaer
        Scanner input = new Scanner(System.in);
        //Kabati user untuk memasukkan angka sisi persegi
        System.out.println("Masukan Sisi persegi");
        //Dalam melakukan inputan, harus memberikan fungsi tipe data yang ingin dimasukkan/untuk membaca tipe data
        double sisi = input.nextDouble();
        //Hitung luas
        double luas = sisi * sisi;
        //Tampilkan hasil
        System.out.println("Luas PERSEGI: " + luas);
    }
}
