package app;

import java.util.Scanner;
import task1.*;
import task2.*;
import task3.*;
import task4.*;
import task5.*;
import task6.*;

/**
 * Главный класс лабораторной работы №6.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание:");
        System.out.println("1 - @Invoke");
        System.out.println("2 - @Default");
        System.out.println("3 - @ToString");
        System.out.println("4 - @Validate");
        System.out.println("5 - @Two");
        System.out.println("6 - @Cache");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> InvokeProcessor.process(new InvokeExample());
            case 2 -> DefaultExample.printDefault();
            case 3 -> System.out.println(new ToStringExample().buildString());
            case 4 -> {
                for (Class<?> c : ValidateProcessor.process(ValidateExample.class)) {
                    System.out.println("Проверяемый класс: " + c.getName());
                }
            }
            case 5 -> TwoExample.printValues();
            case 6 -> CacheExample.printCache();
            default -> System.out.println("Неверный выбор.");
        }
    }
}
