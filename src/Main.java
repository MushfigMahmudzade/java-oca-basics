public class Main {


    void sayHello() {
        System.out.println("Hello");
    }


    void sayBye() {
        System.out.println("Bye");
    }

    public static void main(String[] args) {


        Main obj1 = new Main();


        Main obj2 = new Main();


        obj1.sayHello();
        obj2.sayBye();
    }
}