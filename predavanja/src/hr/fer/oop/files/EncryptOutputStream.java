package hr.fer.oop.files;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptOutputStream extends OutputStream {
    private OutputStream stream;
    public EncryptOutputStream(OutputStream stream) {
        this.stream = stream;
    }
    @Override
    public void write(int b) throws IOException {
        char character = (char) b;
        stream.write(Character.toUpperCase(b));
    }
}
