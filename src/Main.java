import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String firstName = "Ivanov";
        if (firstName.isEmpty()) {
            throw new RuntimeException("Поле ФАМИЛИЯ не заполнено");
        } else {
            char[] c = firstName.toCharArray();
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    if (c[i] == m[j]) {
                        throw new RuntimeException("Поле ФАМИЛИЯ заполнено не корректно");
                    }
                }
            }
            firstName = firstName.replace("_", "");
            firstName = firstName.replace("-", "");
            firstName = firstName.replace(" ", "");
        }
        String middleName = "Ivan";
        if (middleName.isEmpty()) {
            throw new RuntimeException("Поле ИМЯ не заполнено");
        } else {
            char[] c = middleName.toCharArray();
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    if (c[i] == m[j]) {
                        throw new RuntimeException("Поле ИМЯ заполнено не корректно");
                    }
                }
            }
            middleName = middleName.replace("_", "");
            middleName = middleName.replace("-", "");
            middleName = middleName.replace(" ", "");
        }
        String lastName = "Ivanovich";

        if (lastName.isEmpty()) {
            throw new RuntimeException("Поле ОТЧЕСТВО не заполнено");
        } else {
            char[] c = lastName.toCharArray();
            for (int i = 0; i < c.length ; i++) {
                for (int j = 0; j < m.length ; j++) {
                    if (c[i] == m[j]) {
                        throw new RuntimeException("Поле ОТЧЕСТВО заполнено не корректно");
                    }
                }
            }
            lastName = lastName.replace("_", "");
            lastName = lastName.replace("-", "");
            lastName = lastName.replace(" ", "");
        }
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О.сотрудника — " + fullName);

        System.out.println("Задание 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase);

        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}