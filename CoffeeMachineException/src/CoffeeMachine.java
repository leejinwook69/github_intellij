public class CoffeeMachine {
    private int amountOfCoffeeBeans;

    public CoffeeMachine(int beans) {
        amountOfCoffeeBeans = beans;
    }
    public int getAmountOfCoffeeBeans() {
        return amountOfCoffeeBeans;
    }

    public void addCoffeeBeans(int beans) {
        amountOfCoffeeBeans += beans;
    }

    public void brew() throws NoCoffeeException{
        if (amountOfCoffeeBeans < 10) {
            throw new NoCoffeeException("NO Coffee Exception");
        }
        System.out.println("Brewing...");
        amountOfCoffeeBeans -= 10;
    }
}
