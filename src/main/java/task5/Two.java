package task5;

import java.lang.annotation.*;

/**
 * Аннотация @Two используется для того, чтобы присвоить классу два значения:
 * одно текстовое и одно числовое.
 *
 * Аннотация может быть поставлена только на класс.
 * У аннотации есть два обязательных свойства:
 * - first - текстовое значение
 * - second - числовое значение
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Two {

    /**
     * Текстовое значение для аннотации.
     * @return строка first
     */
    String first();

    /**
     * Числовое значение для аннотации.
     * @return число second
     */
    int second();
}
