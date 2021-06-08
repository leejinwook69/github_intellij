public class CoffeeMachineException {
    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine(30);
        try {
            cm.brew();
            cm.brew();
            cm.brew();
            cm.brew();
        }
        catch (NoCoffeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
