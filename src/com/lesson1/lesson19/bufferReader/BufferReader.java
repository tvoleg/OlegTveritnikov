package com.lesson1.lesson19.bufferReader;

import java.io.*;

public class BufferReader {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\com\\lesson1\\lesson19\\" +
                "bufferReader\\firstFile.txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter("src\\com\\lesson1\\lesson19\\" +
                     "bufferReader\\secondFile.txt"));) {
            String a;
            while ((a = bufferedReader.readLine()) != null) {
                out.write(a);
            }
            out.flush();
            System.out.println("Запись в файл произведена");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

