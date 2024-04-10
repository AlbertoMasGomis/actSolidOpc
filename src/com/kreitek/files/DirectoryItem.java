package com.kreitek.files;

import java.util.List;

public interface DirectoryItem {
    void addFile(DirectoryItem file);
    void removeFile(DirectoryItem file);

    DirectoryItem getParent();

    void setParent(DirectoryItem directory);

    String getFullPath();
    List<FileItem> listFiles(); // Cambiado a List<FileItem>

}
