package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution () {}
    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(this.fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {
        String nameFile = "c:\\java\\temp.txt";
        try {
            Solution solution = new Solution("c:\\java\\test.txt");
            solution.writeObject("test");
            FileOutputStream foStream = new FileOutputStream(nameFile);
            ObjectOutputStream oos = new ObjectOutputStream(foStream);
            oos.writeObject(solution);
            oos.flush();
            oos.close();

            FileInputStream fiStream = new FileInputStream(nameFile);
            ObjectInputStream objectStream = new ObjectInputStream(fiStream);

            Solution loadData = (Solution) objectStream.readObject();
            loadData.writeObject("test");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
