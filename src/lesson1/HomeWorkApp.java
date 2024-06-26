package lesson1;
/*1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
        2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец
        три слова: Orange, Banana, Apple.
 _Orange
 _ Banana
 _ Apple

  3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
  4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
  5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в
противном случае “a < b”;
  6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают*/

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(10, 1);
        printColor(-1);
        compareNumbers(6, 5);
    }

    public static void printThreeWords() {
        System.out.println("TASK 1:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println(" ");
    }

    public static void checkSumSign(int a, int b) {
        int c = a + b;
        System.out.println("TASK 2:");
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println(" ");
    }

    public static void printColor(int value) {
        System.out.println("TASK 3:");
        if (value < 0) {
            System.out.println("Red");
        } else if (value >= 0 && value < 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
        System.out.println(" ");
    }

    public static void compareNumbers(int a, int b) {
        System.out.println("TASK 4:");
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}

