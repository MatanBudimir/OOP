package hr.fer.oop.files;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws  IOException {
        Path path = Path.of("C:\\Users\\Matan Budimir\\Documents\\FER\\OOP\\primjer.txt");
        FileInputStream is = new FileInputStream(path.toFile());
        byte[] bytes = is.readAllBytes();
        is.close();
        FileOutputStream os = new FileOutputStream(path.toFile());
        String s = "frano penava";
        for (char by : s.toCharArray())
            os.write(Character.toUpperCase(by));

        os.close();
    }
}
