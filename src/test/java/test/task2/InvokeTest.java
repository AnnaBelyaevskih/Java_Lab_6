package test.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task1.InvokeExample;
import task1.InvokeProcessor;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестирование работы аннотации @Invoke.
 *
 * Проверяется, что метод с аннотацией @Invoke выполняется и меняет состояние объекта.
 */
public class InvokeTest {

    /** Тестируемый объект */
    private InvokeExample example;

    /**
     * Метод выполняется перед каждым тестом.
     * Создает новый экземпляр класса InvokeExample.
     */
    @BeforeEach
    void setUp() {
        example = new InvokeExample();
    }

    /**
     * Проверяет, что метод с аннотацией @Invoke вызывается автоматически.
     *
     * После вызова метода process, флаг executed должен быть true.
     */
    @Test
    void testInvokeExecution() {
        // Вызываем обработчик, который ищет методы с @Invoke и выполняет их
        InvokeProcessor.process(example);

        // Проверяем, что метод действительно выполнился
        assertTrue(example.isExecuted(), "Метод с аннотацией @Invoke не был вызван");
    }
}
