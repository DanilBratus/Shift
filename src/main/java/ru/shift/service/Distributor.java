package ru.shift.service;

import ru.shift.service.constants.*;

import java.util.Arrays;

public class Distributor {
    private String[] array;
    private String typeSorted;
    private String pathWriterFile;
    private TypeFile typeFile;
    FactoryReaderFile factory = new FactoryReaderFile();
    WriterFile writerFile = new WriterFile();
    Sorted sorted = new Sorted();

    private Distributor(){}

    public Distributor(String[] array) {
        this.array = array;
    }

    private void initializingParameters(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new IllegalArgumentException();
            }
            if (array[i].length() == 2) {
                if (array[i].equals(Constant.INTEGER_FORMAT)) {
                    typeFile = TypeFile.INTEGER;
                }
                if (array[i].equals(Constant.STRING_FORMAT)) {
                    typeFile = TypeFile.STRING;
                }
                switch (array[i]) {
                    case "-d": typeSorted = array[i];
                    case "-a": typeSorted = array[i];
                }
                continue;
            }
            if (pathWriterFile == null) {
                pathWriterFile = array[i];
                continue;
            }
            array = Arrays.copyOfRange(array, i, array.length);
            break;
        }
    }

    public void start() {
        initializingParameters();
        implementation();
    }

    private void implementation() {
        writerFile.write(
                sorted.sorted(
                        factory.readerFactory(typeFile).read(array), typeSorted)
                , pathWriterFile);
    }
}
