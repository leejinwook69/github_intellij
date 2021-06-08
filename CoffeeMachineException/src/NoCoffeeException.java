public class NoCoffeeException extends Exception{
    public NoCoffeeException(String s) {
        super(s);
    }

    @Override
    public String getMessage() {
        System.out.println("Get more coffee!");
        return super.getMessage();
    }
}
