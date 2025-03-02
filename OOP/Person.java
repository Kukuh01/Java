public class Person {

//Deklarasi variabel/property class
String name = "Silvanus";
String address = "Jl Ketileng";
final String country = "Indonesia";

//Method
void sayHello(String name){
    System.out.println("Hello" + name);

}

//Constructor
//Ketika membuat constructor wajib saat membuat object diberi parameternya
Person(String paraName, String paraAddress){
    name = paraName;
    address = paraAddress;
}


    
}