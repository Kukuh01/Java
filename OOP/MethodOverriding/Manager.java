//Method overridng adalah kemampuan mendeklarasikan ulang method di child class, yang sudah ada di parent class
//Saat kita melakukan proses overridng tersebut, secara otomatis ketika kita membuat object dari class child, method yang di class parent tidak bisa di akses lagi

package MethodOverriding;

public class Manager {
    String name;

    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is manager " + this.name);
    }
}
