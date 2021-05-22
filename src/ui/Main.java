package ui;

import model.PrintFlag;
import threads.thread1;

public class Main {
    public final static String ESC   = "\u001b[";
    private static thread1 th;
    private static thread1 th2;
    private static thread1 th3;
    private static PrintFlag pf;

    public static void main(String[] args){
        pf = new PrintFlag();
        th = new thread1(pf, 0, 0, 50, 7, 1, 10);
        th2 = new thread1(pf, 0, 7,50,10, 2, 26);
        th3 = new thread1(pf, 0, 10,50,13, 3 , 33);

        System.out.print(ESC+"2J");
        th.start();
        th2.start();
        th3.start();
    }
}
