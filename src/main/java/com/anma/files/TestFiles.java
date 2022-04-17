package com.anma.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestFiles {
    public static void testFiles() {
        for (int i = 1; i < 200; i++) {
            try {
                List<String> strings = Files.readAllLines(Paths.get("/home/andrii/docs/file" + i + ".txt"));
                System.out.println(strings);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
