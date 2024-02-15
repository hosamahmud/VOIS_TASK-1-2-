package commonUtils;

import java.security.SecureRandom;
import java.util.Random;

public class RandomSource {


    public static String generateRandomEmail(int size) {
        String Email;
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int index = (int) (AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        Email = sb.toString() + "@test.com";
        return Email;
    }
}
