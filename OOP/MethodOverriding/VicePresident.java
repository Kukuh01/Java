package MethodOverriding;
public class VicePresident extends Manager{
    
    //Contoh overriding
    void sayHello(String name){
        System.out.println("Hello " + name + " My Name is VP " + this.name);
    }

}
