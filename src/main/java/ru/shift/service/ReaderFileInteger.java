package ru.shift.service;

import ru.shift.service.constants.Constant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderFileInteger implements ReaderFile {
    @Override
    public List<Integer> read(String... file) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < file.length; i++) {

            try (BufferedReader reader = new BufferedReader(new FileReader(Constant.PATH_FILE + file[i]))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    list.add(Integer.valueOf(line));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
