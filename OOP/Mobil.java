public class Mobil {
    int roda = 4;
    int body = 1;
    static int mesin =1;

    static void maju(){
        System.out.println("Maju...");
    }

    void mundur(){
        System.out.println("Mundur....");
    }

    void belok(){
        System.out.println("Belok...");
    }

    void hidupkanMobil(String namaMobil){
        System.out.println("Hidupkan Mobil: " + namaMobil);
    }

    void matikanMobil(String namaMobil){
        System.out.println("Matikan Mobil: " + namaMobil);
    }

    void ubahGigi(String namaMobil){
        System.out.println("Ubah Gigi: " + namaMobil);
    }
}
