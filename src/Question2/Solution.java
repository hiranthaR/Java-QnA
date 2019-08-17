package Question2;

public class Solution {

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.plot();
        obj.display();
        obj.getPages(3);
        obj.print(3);
    }
}

interface Printer {
    void print(int a);

    int getPages(int b);
}

interface Plotter {
    void plot();
}

interface Monitor {
    void display();
}

class Demo implements Printer, Plotter, Monitor {

    @Override
    public void print(int a) {
        System.out.println(a + " pages printed");
    }

    @Override
    public int getPages(int b) {
        System.out.println("printing.. 1 out of " + b + " pages.");
        return b;
    }

    @Override
    public void plot() {
        System.out.println("Plotting...");
    }

    @Override
    public void display() {
        System.out.println("Displaying...");
    }
}