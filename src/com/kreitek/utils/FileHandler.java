package com.kreitek.utils;

import com.kreitek.files.FileItem;

public class FileHandler {

    public void openFile(FileItem file) {
        file.open();
    }

    public void writeFile(FileItem file, byte[] data) {
        file.write(data);
    }

    public void closeFile(FileItem file) {
        file.close();
    }
}
