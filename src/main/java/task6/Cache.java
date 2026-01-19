package task6;

import java.lang.annotation.*;

/**
 * Аннотация @Cache используется для указания областей, которые нужно кешировать.
 * Аннотация может быть поставлена только на класс.
 * Аннотация имеет необязательное свойство value — массив строк.
 * Каждая строка указывает имя кешируемой области. По умолчанию массив пустой.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache {

    /**
     * Список имен областей, которые нужно кешировать.
     */
    String[] value() default {};
}

