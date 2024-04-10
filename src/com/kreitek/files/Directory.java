package com.kreitek.files;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItemBase implements DirectoryItem {

    private static final String NO_ES_VALIDO_PARA_DIRECTORIOS = "No es válido para directorios";
    private final List<FileItem> files; // Cambiado a List<FileItem>

    public Directory(DirectoryItem parent, String name) {
        super(parent, name);
        files = new ArrayList<>();
        // Aquí vendría lógica que rellena la lista de directorios
    }

    @Override
    public List<FileItem> listFiles() {
        return new ArrayList<>(files);
    }

    @Override
    public void addFile(DirectoryItem file) {

    }

    @Override
    public void removeFile(DirectoryItem file) {

    }

    public void addFile(FileItem file) {
        if (!files.contains(file)) {
            files.add(file);
            file.setParent(this);
        }
    }

    @Override
    public void removeFile(FileItem file) { // Cambiado el parámetro a FileItem
        files.remove(file);
    }

    @Override
    public void open() {

    }

    @Override
    public void write(byte[] data) {

    }

    @Override
    public void close() {

    }
}
