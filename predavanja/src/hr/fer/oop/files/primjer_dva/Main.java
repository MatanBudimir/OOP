package hr.fer.oop.files.primjer_dva;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        DirectoryStream.Filter<Path> extensionFilter = new ExtensionFilter();

        Path path = Path.of("C:\\Users\\Matan Budimir\\Documents\\zi");
        /*DirectoryStream<Path> ds = Files.newDirectoryStream(path);

        for (Path path1 : ds) {
            System.out.println(path1.getFileName());
        }

        ds.close();*/

        DirectoryStream<Path> stream = Files.newDirectoryStream(path, extensionFilter);


        for (Path path1 : stream) {
            System.out.println(path1.getFileName());
        }

        stream.close();
    }
}
