package academy.belhard;

import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        // проверка
        Person a1 = new Person("Виталий", "Гурков");
        User a2 = new User("Дмитрий", "Валент", "DV@gmail.com", "12345678");

        System.out.println("Объект 1 - " + a1.getFullName());
        System.out.println("Объект 2 - " + a2.getFullName());
        System.out.println("");
        System.out.println(a2.getFullInfo());
        System.out.println("проверка пароля 87654321 = " + a2.isPasswordCorrect("87654321"));
        System.out.println("проверка пароля 12345678 = " + a2.isPasswordCorrect("12345678"));
    }
}
