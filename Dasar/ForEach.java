public class ForEach {
    public static void main(String[] args) {

        String[][] names = {{"1","2","3"},{"1","2","3"}};

        for(String[] name: names){
            for (String strings : name) {
                System.err.println(strings + " ");
            }
        }
    }
}
