package com.lesson1.lesson19.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String args[]) {
        try (FileInputStream fileIn = new FileInputStream("src\\com\\lesson1\\lesson19\\fileCopy\\file");
             FileOutputStream fileOut = new FileOutputStream("src\\com\\lesson1\\lesson19\\fileCopy\\file_copy")) {
            int a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a); // Чтение содержимого файла file.txt и запись в файл copied_file.txt
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
