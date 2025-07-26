package cordova.plugins.diagnostic;

import java.security.SecureRandom;

/**
 * Wrapper service for cryptographic operations.
 */
public class CryptoService {
    private static final SecureRandom secureRandom = new SecureRandom();
    public static String generateRandomId() {
        int random = secureRandom.nextInt(1000000) + 1;
        return Integer.toString(random);
    }
}
