public class Main {
    public static void main(String[] args) {
        Parent p = new Parent("name");

        Child c = new Child("cname", 1);

        Parent p2 = (Parent) new Child("name2", 2);




    }
    
}
