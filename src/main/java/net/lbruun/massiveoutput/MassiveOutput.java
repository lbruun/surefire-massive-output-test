package net.lbruun.massiveoutput;

import java.io.PrintStream;
import java.util.Random;

public class MassiveOutput {

    public static final int DEFAULT_NO_OF_LINES = 10000;
    public static void main(String[] args) {
        printManyLinesToStdOut(DEFAULT_NO_OF_LINES);
    }
    
    public static void printManyLinesToStdOut(int noOfLines) {
        Random random = new Random();
        for(int i = 1; i <= noOfLines ; i++) {
            printIntZeroPadded(System.out, i , 10);
            System.out.print(" ");
            System.out.println(RandomStringUtil.getRandomString(random, 80));
        }
    }
    
    private static void printIntZeroPadded(PrintStream ps, int x, int fieldLen) {
        String xStr = Integer.toString(x);
        for (int i = 0; i < (fieldLen - xStr.length()); i++) {
            ps.append('0');
        }
        ps.print(xStr);
    }
}
