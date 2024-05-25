package lesson2;

public class homeWork2 {
    public static void main(String[] args) {
        System.out.println(task1(1, 1));
        task2(-1);
        System.out.println(task3(0));
        task4("hello", 5);
        System.out.println(task5(1904));
    }

    /**
     * Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от
     * 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean task1(int a, int b) {
        return a + b >= 10 && a + b <= 20;

    }

    /**
     * Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static void task2(int n) {
        if (n >= 0) {
            System.out.println(n + ": положительное число");
        } else {
            System.out.println(n + ": отрицательное число");
        }
    }

    /**
     * Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
     * отрицательное, и вернуть false если положительное.
     */
    public static boolean task3(int x) {
        return x < 0;
    }

    /**
     * Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
     * указанную строку, указанное количество раз;
     */
    public static void task4(String s, int r) {
        for (int i = 0; i < r; i++) {
            System.out.println(s);

        }
    }

    /**
     * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
     * не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */

    public static boolean task5(int y) {
        return ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0);
    }
}
