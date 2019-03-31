package ru.korovko.java.lab4;

import java.time.LocalDate;
import java.util.Comparator;

public class User implements Person {
    private String name;
    private LocalDate birthday;

    User(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
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

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(User::getName).thenComparing(User::getBirthDate).compare(this, (User) o);
    }
}

