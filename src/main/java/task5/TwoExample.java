package task5;

/**
 * Пример класса, который помечен аннотацией @Two.
 * В аннотации указываются два значения: строка "Тест" и число 5.
 * Метод printValues показывает, как прочитать эти значения и вывести
 * их на экран.
 */
@Two(first = "Тест", second = 5)
public class TwoExample {

    /**
     * Метод выводит значения свойств аннотации @Two для этого класса.
     * Сначала метод получает аннотацию с класса. Потом берет значения
     * first и second и печатает их в консоль.
     */
    public static void printValues() {
        // Получаем аннотацию с этого класса
        Two annotation = TwoExample.class.getAnnotation(Two.class);

        // Выводим значения свойств
        System.out.println("first = " + annotation.first());
        System.out.println("second = " + annotation.second());
    }
}

