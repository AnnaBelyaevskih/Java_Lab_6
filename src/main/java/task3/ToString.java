package task3;

import java.lang.annotation.*;

/**
 * Аннотация @ToString используется для управления тем, какие поля класса
 * включать в строковое представление объекта.
 *
 * Её можно ставить на класс или на отдельные поля.
 *
 * У аннотации есть необязательное свойство value, которое может быть
 * YES или NO. Если значение не указано, по умолчанию стоит YES.
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ToString {
    /**
     * Указывает, нужно ли включать поле в строковое представление.
     * YES - поле будет отображено.
     * NO - поле не будет отображено.
     * @return режим отображения поля
     */
    Mode value() default Mode.YES;
}
