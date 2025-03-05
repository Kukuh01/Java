package MethodOverriding;
public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Silvanus";
        manager.sayHello("Totok");

        VicePresident vp = new VicePresident();
        vp.name = "Mirna";
        vp.sayHello("nonok");
    }
}
