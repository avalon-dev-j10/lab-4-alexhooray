package ru.korovko.java.lab4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sorting implements Sort {
    @Override
    public void sort(Object[] array) {
        if (array instanceof Comparable[]){
            sort(array);
        }
    }

    @Override
    public void sort(Comparable[] array) {
        Arrays.sort(array);
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
    Collections.reverse(Arrays.asList(array));
    }
}
