package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import java.util.Date;

public class Human implements Person {
    private String name;
    private LocalDate birthday;

    Human(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthday;
    }
}
