package task4;

import java.lang.annotation.*;

/**
 * Аннотация @Validate используется для указания списка классов, которые
 * должны быть проверены или использованы для валидации.
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {

    /**
     * Список классов, которые нужно проверять или использовать для валидации.
     * @return массив классов
     */
    Class<?>[] value();
}
