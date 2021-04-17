package net.lbruun.massiveoutput;

import static net.lbruun.massiveoutput.MassiveOutput.DEFAULT_NO_OF_LINES;
import org.junit.jupiter.api.Test;

public class MyTest {
    
    @Test
    void doLotsOfLogOutput() {        
        MassiveOutput.printManyLinesToStdOut(DEFAULT_NO_OF_LINES);
    }
}
