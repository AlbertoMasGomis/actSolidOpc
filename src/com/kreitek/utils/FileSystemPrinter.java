package com.kreitek.utils;

import com.kreitek.files.FileItem;
import com.kreitek.files.DirectoryItem;

public class FileSystemPrinter {

    public static void print(FileItem item, int nivel) {
        String indentation = "\t".repeat(nivel);
        String message = String.format("%s%s = %d bytes", indentation, item.getName(), FileSystemSizeCalculator.calculateSize(item));
        System.out.println(message);
    }

    public static void print(DirectoryItem item, int nivel) {
        String indentation = "\t".repeat(nivel);
        String message = String.format("%s%s = %d bytes", indentation, item.getFullPath(), FileSystemSizeCalculator.calculateSize(item));
        System.out.println(message);

        for (FileItem subitem : item.listFiles()) {
            print(subitem, nivel + 1);
        }
    }
}
