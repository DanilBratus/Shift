package ru.shift.service;

import ru.shift.service.constants.Constant;

import java.util.Collections;
import java.util.List;

public class Sorted {
    private List<?> sortedASC(List list) {
        Collections.sort(list);
        return list;
    }
    private List<?> sortedDESC(List list) {
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }

    public List<?> sorted(List<?> list, String typeSorted) {
        if (typeSorted == null || typeSorted.equals(Constant.SORTED_ASC)) {
            return sortedASC(list);
        }
        if (typeSorted.equals(Constant.SORTED_DESC)) {
            return sortedDESC(list);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
