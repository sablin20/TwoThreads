import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        var myClass = new MyClass();
        var service = Executors.newFixedThreadPool(2);
        service.submit(new Odd(myClass, 10));
        service.submit(new Even(myClass, 10));
        service.shutdown();
    }
}