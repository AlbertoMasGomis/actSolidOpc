package com.kreitek.files;

public interface FileItem {
    String getName();

    void setName(String name);

    void open();

    void write(byte[] data);

    void close();

    void setParent(com.kreitek.files.Directory directory);
}
