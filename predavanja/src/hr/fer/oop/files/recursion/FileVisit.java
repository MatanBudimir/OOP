package hr.fer.oop.files.recursion;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisit implements FileVisitor<Path> {
    private static int counter = -1;
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        if (counter != -1) {
            for (int i = 0; i < counter; i++)
                System.out.print("-");
            System.out.println(dir.getFileName());
        }
        counter++;
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        for (int i = 0; i < counter; i++)
            System.out.print(" ");
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.printf("Failed to read file %s%n.", file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        counter--;
        return FileVisitResult.CONTINUE;
    }
}
