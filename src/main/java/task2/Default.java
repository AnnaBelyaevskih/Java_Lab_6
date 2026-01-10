package task2;

import java.lang.annotation.*;

/**
 * Аннотация @Default используется для указания значения по умолчанию
 * для класса или поля.
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Default {

    /**
     * Класс, который будет использоваться как значение по умолчанию.*
     * @return класс по умолчанию
     */
    Class<?> value();
}
