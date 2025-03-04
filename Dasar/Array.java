public class Array {
    public static void main(String[] args) {

        //Cara mengisi array pertama
        String[] arraStrings;
        //cara kedua
        arraStrings = new String[3];
        arraStrings[0] = "Silvanus";
        arraStrings[1] = "Kukuh";
        arraStrings[2] = "prasetyo";

        //Cara mengisi array kedua array intializer
        int[] arrayInt = new int[]{
            10,20,90,10,10
        };

        //Melihat panjang array
        System.out.println(arrayInt.length);
    }
}
