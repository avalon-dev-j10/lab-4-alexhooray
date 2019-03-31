package ru.korovko.java.lab4;

import java.util.Comparator;

public interface Sort {

    void sort(Object[] array);

    void sort(Comparable[] array);

    void sort(Object[] array, Comparator comparator);
}
