package task3;

import java.lang.reflect.Field;

/**
 * Пример класса, который формирует строковое представление самого себя.
 * Класс помечен аннотацией @ToString, а одно из полей отдельно помечено
 * как @ToString(Mode.NO), чтобы его не включать в строку.
 */
@ToString
public class ToStringExample {

    /**
     * Поле name будет включено в строку, потому что оно не имеет специальной
     * пометки NO.
     */
    private String name = "Алексей";

    /**
     * Поле age помечено как NO, поэтому при формировании строки оно не будет
     * отображаться.
     */
    @ToString(Mode.NO)
    private int age = 30;

    /**
     * Метод формирует строковое представление объекта.
     *
     * Он перебирает все поля класса. Если поле помечено как YES или не имеет
     * аннотации @ToString, его имя и значение добавляются в строку.
     * Поля, помеченные как NO, игнорируются.
     *
     * @return строка, содержащая только поля, которые нужно отображать
     */
    public String buildString() {
        StringBuilder result = new StringBuilder();

        for (Field field : getClass().getDeclaredFields()) {
            field.setAccessible(true); // чтобы можно было получить значение private поля

            // получаем аннотацию поля
            ToString annotation = field.getAnnotation(ToString.class);

            // если нет аннотации или значение YES, добавляем поле в строку
            if (annotation == null || annotation.value() == Mode.YES) {
                try {
                    result.append(field.getName())
                            .append("=")
                            .append(field.get(this))
                            .append(" ");
                } catch (IllegalAccessException ignored) {
                    // если поле нельзя прочитать, просто пропускаем
                }
            }
        }

        return result.toString().trim();
    }
}
