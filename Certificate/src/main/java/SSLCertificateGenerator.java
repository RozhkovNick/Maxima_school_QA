import java.io.FileInputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;

public class SSLCertificateGenerator {
    public static void main(String[] args) throws Exception {
        // Генерация ключевой пары
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Создание самоподписанного сертификата
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Certificate certificate = certificateFactory.generateCertificate
                (new FileInputStream("src/main/resources/certeficate.cer"));

        // Сохранение сертификата и приватного ключа в хранилище ключей
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        keyStore.load(null, null);
        keyStore.setKeyEntry("alias", keyPair.getPrivate(), null, new Certificate[]{certificate});
    }
}
