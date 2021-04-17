package net.lbruun.massiveoutput;

import java.util.Random;

public class RandomStringUtil {

    private RandomStringUtil() {
    }
    

    
    public static String getRandomString(Random random, int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int randomInt = getRandomInt(random, 32, 126); // only use printable chars, range [32,126] 
            sb.append((char) randomInt);
        }
        return sb.toString();
    }
    
    private static int getRandomInt(Random random, int min, int max) {
        return random.nextInt(max + 1 - min) + min;
    }
    
}
