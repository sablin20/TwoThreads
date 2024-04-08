public class Even implements Runnable {
    private NumberPrinter numberPrinter;
    private int max;

    public Even(NumberPrinter numberPrinter, int max) {
        this.numberPrinter = numberPrinter;
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 2; i <= max; i += 2) {
            numberPrinter.printEvenNum(i);
        }
    }
}
