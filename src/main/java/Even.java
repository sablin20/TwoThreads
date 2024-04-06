public class Even implements Runnable {
    private MyClass myClass;
    private int max;

    public Even(MyClass myClass, int max) {
        this.myClass = myClass;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 2; i <= max; i += 2) {
            myClass.printEvenNum(i);
        }
    }
}
