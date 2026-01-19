package task4;

/**
 * Обработчик аннотации @Validate.
 *
 * Класс предназначен для того, чтобы получать список классов из аннотации
 * @Validate и выводить их или использовать для проверки.
 */
public final class ValidateProcessor {

    /**
     * Метод получает список классов из аннотации @Validate на заданном классе.
     * @param clazz класс, на котором ищется аннотация
     * @return массив классов, указанных в аннотации
     */
    public static Class<?>[] process(Class<?> clazz) {
        Validate validate = clazz.getAnnotation(Validate.class);
        if (validate.value().length == 0) {
            throw new IllegalArgumentException("Список классов для проверки пуст.");
        }
        return validate.value();
    }
}

