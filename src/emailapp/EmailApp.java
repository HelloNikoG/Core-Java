package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");// build object

        em1.changePassword("buttbutt");
        em1.setAlternateEmail("niko@mail.com");
        System.out.println(em1.toString());


    }
}

