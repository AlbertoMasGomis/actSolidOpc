// FileSystemSizeCalculator.java
package com.kreitek.utils;

import com.kreitek.files.Directory;

public class FileSystemSizeCalculator {
    public static int calculateSize(FileSystemItem item) {
        int size = 0;
        if (item instanceof Directory) {
            for (FileSystemItem subitem : ((Directory) item).listFiles()) {
                size += calculateSize(subitem);
            }
        } else {
            size += item.getSize();
        }
        return size;
    }
}
