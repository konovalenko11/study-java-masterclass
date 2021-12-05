package encapsulation;

public class Printer {
    private int tonerLevel = -1;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 1 || tonerAmount > 100) {
            System.out.println("Toner Amount value should be in range 1..100!");
            return -1;
        }
        if (tonerAmount + this.tonerLevel > 100) {
            System.out.println("We're adding too much toner! End level cannot" +
                    " be higher than 100!");
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        if (pages <= 0) {
            System.out.println("No pages to print!");
            return 0;
        }
        int pagesToPrint = this.duplex ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}