package model;

public class PrintFlag {
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String RED_BACKGROUND = "\u001B[41m";

    public PrintFlag(){
    }

    public String printColor(int color){
        if(color == 1){
            return YELLOW_BACKGROUND+" ";
        }else if(color == 2){
            return BLUE_BACKGROUND+" ";
        }else{
            return RED_BACKGROUND+" ";
        }

    }


}
