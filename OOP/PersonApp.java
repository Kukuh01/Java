public class PersonApp {

    public static void main(String[] args) {

        //Mengambil objek person di objek person
        var person1 = new Person("Silvanus","ketileng");
        var person2 = new Person("Ananta","Imam Bonjol");
        var person3 = new Person("Roif", "Wonodri");


        person1.sayHello("Silvanus");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        
    }
}
