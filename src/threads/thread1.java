package threads;

import model.PrintFlag;

public class thread1 extends Thread{

    public final static String ESC   = "\u001b[";

    private PrintFlag pf;
    private int a;
    private int b;
    private int c;
    private int d;
    private int sleep;
    private int color;
    public thread1(PrintFlag pf, int a, int b,int c,int d, int color, int sleep){
        this.pf = pf;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.sleep = sleep;
        this.color = color;
    }

    @Override
    public void run(){
        printShit();
    }
    public synchronized void printShit(){
        for(int i = a; i < c; i++){
            for(int j = b; j < d; j++){
                System.out.print(ESC+(i)+"G"+ESC+(j)+"d"+pf.printColor(color));

                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
