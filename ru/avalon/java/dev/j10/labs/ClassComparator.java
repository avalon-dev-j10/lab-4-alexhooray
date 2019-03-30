package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class ClassComparator implements Comparator<Human> {
    @Override
    public int compare(Human human, Human t1) {
        return human.getName().compareTo(t1.getName());
    }
}
