package ru.korovko.java.lab4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

	    String[] strings = {"Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять", "Десять",
                "Одинадцать", "Двенадцать", "Тринадцать", "Четырнадцать", "Пятнадцать", "Шестнадцать", "Семнадцать",
                "Восемнадцать", "Девятнадцать", "Двадцать"};

	    Person[] persons = {
	            new User("Илья",  LocalDate.of(1984, 3, 1)),
                new User("Андрей", LocalDate.of(1984, 3, 3)),
                new User("Антон", LocalDate.of(1950,2,10)),
                new User("Максим", LocalDate.of(2000, 1, 21)),
                new User("Дима", LocalDate.of(1990, 6, 23)),
                new User("Сергей", LocalDate.of(1965, 12, 12)),
                new User("Михаил", LocalDate.of(1985, 9, 9)),
                new User("Федор", LocalDate.of(1982, 8, 3)),
                new User("Дмитрий", LocalDate.of(1995, 9, 8)),
                new User("Женя", LocalDate.of(1986, 8, 11)),
                new User("Кирилл", LocalDate.of(1981, 7, 14)),
                new User("Анатолий", LocalDate.of(1983, 6, 18)),
                new User("Павел", LocalDate.of(1994, 4, 24)),
                new User("Никита", LocalDate.of(1998, 10, 2)),
                new User("Олег", LocalDate.of(1990, 3, 28)),
                new User("Валентин", LocalDate.of(1981, 5, 30)),
                new User("Екатерина", LocalDate.of(1980, 11, 19)),
                new User("Дарья", LocalDate.of(1992, 11, 12)),
                new User("Александр", LocalDate.of(1978, 1, 4)),
                new User("Валентин", LocalDate.of(1979, 2, 16))} ;

        Sort sort = new SortImpl();
        Comparator<String> comparator = new ComparatorImpl();

        sort.sort(persons);
        System.out.println(Arrays.toString(persons));

        sort.sort(strings);
        System.out.println(Arrays.toString(strings));

        sort.sort(strings, comparator.reversed());
        System.out.println(Arrays.toString(strings));
    }
}
