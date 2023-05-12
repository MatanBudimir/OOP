package hr.fer.oop.files.recursion;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryTree {
    public static void directoryTree(Path root, int level) {
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(root)) {
            for (Path path : ds) {
                if (Files.isDirectory(path)) {
                    for (int i = 0; i < level; i++)
                        System.out.print("-");
                    System.out.println(path.getFileName());
                    directoryTree(path, level + 1);
                } else {
                    for (int i = 0; i < level; i++)
                        System.out.print("-");

                    System.out.println(path.getFileName());
                }

            }
        } catch (Exception exception) {
            return;
        }
    }

    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Matan Budimir\\Documents\\OOPMI\\oop2023_MI_ver2_exercise1");
        directoryTree(path, 0);
    }
}
