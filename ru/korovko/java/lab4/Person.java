package ru.korovko.java.lab4;

import java.time.LocalDate;
import java.util.Date;

/**
 * Абстрактное представление о человеке.
 *
 * <p>С точки зрения модели, человек описывается именем и
 * датой рождения.
 *
 * <p>При сравнении одного человека с другим следует
 * учитывать, что больше будет тот человек, чьё имя должно
 * быть ниже в списке имён, отсортированном по возрастанию.
 * Из двух людей с одним и тем же именем больше будет тот,
 * который старше.
 */
public interface Person extends Comparable {

    String getName();

    LocalDate getBirthDate();

    int compareTo(Object o);
}
