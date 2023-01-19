package ru.shift.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterFile {
    public void write(List<?> list, String nameFile) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nameFile))) {
            for (Object elements : list) {
                bufferedWriter.write(elements + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
