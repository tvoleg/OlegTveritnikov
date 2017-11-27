package com.lesson1.lesson19.fileCopy;

import java.io.*;

public class FileInputOutputStreamDemo {
    public static void main(String args[]) {
        try (FileInputStream input = new FileInputStream("scr\\com\\lesson1\\lesson19\\fileCopy\\file");
             FileOutputStream output = new FileOutputStream("scr\\com\\lesson1\\lesson19\\fileCopy\\file_copy")) {
            char c[] = {'a', 'b', 'c'};
            for (char i : c) {
                output.write(c[i]); // Запись каждого символа в текстовый файл
            }
            int size = input.available();
            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.println("Exception.");
        }
    }
}
