package com.kreitek.files;

public interface FileSystemReadable {
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
}
