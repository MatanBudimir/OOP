package hr.fer.oop.files.primjer_dva;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.Path;

public class ExtensionFilter implements Filter<Path> {
    @Override
    public boolean accept(Path entry) throws IOException {
        return entry.getFileName().toString().endsWith(".c");
    }
}
