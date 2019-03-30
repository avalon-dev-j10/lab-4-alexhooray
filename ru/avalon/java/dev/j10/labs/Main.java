package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {"Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять", "Десять",
                "Одинадцать", "Двенадцать", "Тринадцать", "Четырнадцать", "Пятнадцать", "Шестнадцать", "Семнадцать",
                "Восемнадцать", "Девятнадцать", "Двадцать"};

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = {new User("Илья",  LocalDate.of(1984, 3, 1)),
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

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new Sorting();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator<User> comparator = new NameComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);
        System.out.println(Arrays.toString(persons));

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        System.out.println(Arrays.toString(strings));

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        System.out.println(Arrays.toString(strings));
    }
}
