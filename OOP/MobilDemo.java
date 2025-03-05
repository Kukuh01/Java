public class MobilDemo {
    public static void main(String[] args) {
        Mobil avanza = new Mobil();
        Mobil xenia = new Mobil();
        avanza.hidupkanMobil("Avanza");
        avanza.ubahGigi("Avanza");
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda    : " + avanza.roda);
        System.out.println("Roda    : " + avanza.mesin); 
        avanza.matikanMobil("Anvanza");  

        System.out.println();

        xenia.hidupkanMobil("Xenia");
        xenia.ubahGigi("Xenia");
        xenia.maju();
        xenia.mundur();
        xenia.belok();
        System.out.println("Roda    : " + avanza.roda);
        System.out.println("Roda    : " + avanza.mesin);  
        xenia.matikanMobil("Xenia"); 
    }

}
