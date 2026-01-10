package task2;

/**
 * Пример класса, который помечен аннотацией @Default.
 * В этой аннотации указывается, что значение по умолчанию для этого класса
 * — это класс String.
 */
@Default(String.class)
public class DefaultExample {

    /**
     * Этот метод показывает класс по умолчанию, который указан в аннотации.
     */
    public static void printDefault() {
        // Получаем аннотацию с этого класса
        Default annotation = DefaultExample.class.getAnnotation(Default.class);

        // Выводим имя класса, который указан как значение по умолчанию
        System.out.println("Класс по умолчанию: " + annotation.value().getName());
    }
}
