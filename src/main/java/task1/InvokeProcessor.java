package task1;

import java.lang.reflect.Method;

/**
 * Обработчик аннотации @Invoke.
 * Этот класс проверяет все методы объекта, ищет те, которые помечены
 * аннотацией @Invoke, и вызывает их автоматически.
 */
public final class InvokeProcessor {

    /**
     * Метод ищет и вызывает все методы с аннотацией @Invoke.
     * Сначала он получает список всех методов объекта. Потом проверяет
     * каждый метод: если на нем есть аннотация @Invoke, метод вызывается.
     * Если при вызове метода произошла ошибка, программа выбросит
     * исключение с сообщением об ошибке.
     * @param object объект, методы которого будут проверяться и вызываться
     */
    public static void process(Object object) {
        for (Method method : object.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    method.setAccessible(true);
                    method.invoke(object);
                } catch (Exception e) {
                    throw new RuntimeException("Ошибка вызова метода " + method.getName(), e);
                }
            }
        }
    }
}

