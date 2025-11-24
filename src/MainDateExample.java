import java.util.Date;

public class MainDateExample {
    public static void main(String[] args) {

        Date utilDate = new Date();
        System.out.println("java.util.Date: " + utilDate);

        dateexample.Date customDate = new dateexample.Date();
        System.out.println(customDate.info());
    }
}