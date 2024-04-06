public class Odd implements Runnable {
    private MyClass myClass;
    private int max;

    public Odd(MyClass myClass, int max) {
        this.myClass = myClass;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 1; i <= max; i += 2) {
            myClass.printOddNum(i);
        }
    }
}
