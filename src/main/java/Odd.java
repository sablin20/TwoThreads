public class Odd implements Runnable {
    private NumberPrinter numberPrinter;
    private int max;

    public Odd(NumberPrinter numberPrinter, int max) {
        this.numberPrinter = numberPrinter;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 1; i <= max; i += 2) {
            numberPrinter.printOddNum(i);
        }
    }
}
