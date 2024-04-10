package com.kreitek.utils;

import com.kreitek.files.Directory;
import com.kreitek.files.DirectoryItem;
import com.kreitek.files.FileItem;

public class FileSystemBuilder {

    private final DirectoryItem root;
    private DirectoryItem currentDirectory;
    private final FileHandler fileHandler;

    public static FileSystemBuilder getBuilder() {
        return new FileSystemBuilder();
    }

    public FileSystemBuilder() {
        root = new Directory(null, "");
        currentDirectory = root;
        fileHandler = new FileHandler();
    }

    public FileSystemBuilder addFile(String name, int size) {
        FileItem file = new com.kreitek.files.File(currentDirectory, name);
        fileHandler.openFile(file);
        fileHandler.writeFile(file, new byte[size]);
        fileHandler.closeFile(file);
        currentDirectory.addFile((DirectoryItem) file);
        return this;
    }

    public FileSystemBuilder addDirectory(String name) {
        DirectoryItem directory = new Directory(currentDirectory, name);
        currentDirectory.addFile(directory);
        currentDirectory = directory;
        return this;
    }

    public FileSystemBuilder upOneDirectory() {
        if (currentDirectory.getParent() != null) {
            currentDirectory = currentDirectory.getParent();
        }
        return this;
    }

    public DirectoryItem build() {
        return root;
    }
}
