package task1;

import java.lang.annotation.*;

/**
 * Аннотация @Invoke используется для того, чтобы автоматически вызывать
 * метод во время работы программы.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Invoke {
}
