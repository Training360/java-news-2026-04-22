package demo;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class KeyDerivationDemo {

    static void main() throws Exception {
        var password = "hunter2".toCharArray();
        var salt = "somesalt".getBytes();
        var spec = new PBEKeySpec(password, salt, 65536, 256);

        var factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        var key = factory.generateSecret(spec);

        System.out.println("Derived key format: " + key.getFormat());
    }
}
