package hr.fer.oop.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Matan Budimir\\Documents\\zi\\primjer.txt");

        Path path = file.toPath();

        Scanner scanner = new Scanner(file);

        file = new File(path.toFile().toURI());



        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
