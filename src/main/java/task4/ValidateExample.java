package task4;

/**
 * Пример класса, который помечен аннотацией @Validate.
 *
 * В аннотации указывается, какие классы нужно проверять: в этом примере
 * String и Integer.
 */
@Validate({String.class, Integer.class})
public class ValidateExample {
}
