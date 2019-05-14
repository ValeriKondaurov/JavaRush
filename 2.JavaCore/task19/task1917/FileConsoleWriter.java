package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public static void main(String[] args) {
    }

    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter =  new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter (fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter (file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
        ;
    }

    public FileConsoleWriter(FileDescriptor fd) {
        this.fileWriter = new FileWriter (fd);
    }

    public void write(int c) throws IOException {
        System.out.println(c);
        fileWriter.write(c);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        for (int i = off; i < off+len; i++)
            System.out.print(cbuf[i]);
        fileWriter.write(cbuf, off, len);
    }

    public void write(String str, int off, int len) throws IOException {
        if (len < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            char[] var4 = new char[len];
            str.getChars(off, off + len, var4, 0);
            System.out.println(var4);
        }


        fileWriter.write(str, off, len);
    }

    public void close() throws IOException {
        fileWriter.close();
    }

    public void write(char[] cbuf) throws IOException {
        System.out.println(cbuf);
        fileWriter.write(cbuf);
    }

    public void write(String str) throws IOException {
        System.out.println(str);
        fileWriter.write(str);
    }
}
