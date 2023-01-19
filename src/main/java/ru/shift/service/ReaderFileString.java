package ru.shift.service;

import ru.shift.service.constants.Constant;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFileString implements ReaderFile {
    @Override
    public List<String> read(String... file) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < file.length; i++) {

            try (BufferedReader reader = new BufferedReader(new FileReader(Constant.PATH_FILE + file[i]))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    list.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}

