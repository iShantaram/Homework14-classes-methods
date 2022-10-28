package pro.sky.java.course1.Homework14;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    /**
     * Пожалуй воспользуемся конструктором с одной строкой,
     * кажется, он достаточно для этого хорош.
     */
    Author(String firstName, String lastName) {
        this(firstName + " " + lastName);
    }

    /**
     * Если передана одна строка в качестве автора, то:
     * 1. заменяем все знаки (спецсимволы) на пробелы
     * 2. все множественные пробелы заменяем на один " "
     * 3. удаляем пробелы в начале и в конце, если есть
     * 4. разделяем оставшуюся строку по первому пробелу на две
     * 5. всю вторую часть считаем фамилией =), если второй части нет - заполняем пустой строкой
     */
    Author(String fullname) {
        String[] names = fullname.replaceAll("\\p{Punct}", " ").replaceAll("\\s{2,}", " ").trim().split("\\s", 2);
        this.firstName = names[0];
        if (names.length == 2) {
            this.lastName = names[1];
        } else {
            this.lastName = "";
        }
    }

    @Override
    public String toString() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        return firstName + " " + lastName;
    }

    /**
     * Авторы равны, если и фамилия и имя совпадают
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

