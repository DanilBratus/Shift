package ru.shift.service;

import ru.shift.service.constants.TypeFile;

public class FactoryReaderFile {
    public ReaderFile readerFactory(TypeFile type) {
        switch (type) {
            case INTEGER: return new ReaderFileInteger();
            case STRING: return new ReaderFileString();
            default: return null;
        }
    }
}
