package test.task4;

import org.junit.jupiter.api.Test;
import task4.Validate;
import task4.ValidateProcessor;
import task4.ValidateExample;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестирование работы аннотации @Validate и обработчика ValidateProcessor.
 * Этот тест проверяет:
 * 1. Корректное извлечение массива классов из аннотации.
 * 2. Обработка случая, когда аннотация содержит пустой массив, и должно
 *    выбрасываться исключение IllegalArgumentException.
 */
public class ValidateTest {

    /**
     * Проверяет корректность извлечения списка классов из аннотации @Validate.
     * Метод вызывает обработчик ValidateProcessor для класса ValidateExample.
     * Ожидается, что массив классов будет содержать ровно 2 элемента,
     * как указано в аннотации.
     */
    @Test
    void testCorrectValidation() {
        Class<?>[] classes = ValidateProcessor.process(ValidateExample.class);

        // Проверяем, что обработчик вернул массив нужной длины
        assertEquals(2, classes.length, "Количество классов в аннотации должно быть 2");
    }

    /**
     * Проверяет обработку пустого массива в аннотации @Validate.
     * Создается внутренний класс EmptyValidate с аннотацией @Validate({}).
     * Ожидается, что при передаче такого класса обработчику будет выброшено
     * исключение IllegalArgumentException.
     */
    @Test
    void testEmptyValidation() {
        assertThrows(
                IllegalArgumentException.class,
                () -> ValidateProcessor.process(EmptyValidate.class),
                "Должно выбрасываться IllegalArgumentException при пустом массиве классов"
        );
    }

    /**
     * Внутренний тестовый класс с аннотацией @Validate, содержащей пустой массив.
     * Используется для проверки корректного выбрасывания исключения.
     */
    @Validate({})
    static class EmptyValidate {
    }
}
