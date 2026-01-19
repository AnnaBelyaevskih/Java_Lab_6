package app;

import java.util.Scanner;
import task1.*;
import task2.*;
import task3.*;
import task4.*;
import task5.*;
import task6.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = readInt(scanner);

            switch (choice) {
                case 1 -> runInvokeTask();
                case 2 -> runDefaultTask();
                case 3 -> runToStringTask();
                case 4 -> runValidateTask();
                case 5 -> runTwoTask();
                case 6 -> runCacheTask();
                case 0 -> System.out.println("Выход из программы.");
                default -> System.out.println("Неверный пункт меню. Повторите ввод.");
            }

            if (choice != 0) {
                System.out.println("\nНажмите Enter для продолжения...");
                scanner.nextLine();
            }

        } while (choice != 0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Выберите задание:");
        System.out.println("1 - Аннотация @Invoke");
        System.out.println("2 - Аннотация @Default");
        System.out.println("3 - Аннотация @ToString");
        System.out.println("4 - Аннотация @Validate");
        System.out.println("5 - Аннотация @Two");
        System.out.println("6 - Аннотация @Cache");
        System.out.println("0 - Выход");
        System.out.print("Ваш выбор: ");
    }

    private static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка ввода. Введите целое число.");
            scanner.nextLine();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    private static void runInvokeTask() {
        System.out.println("\nЗадание 1: @Invoke");
        InvokeExample example = new InvokeExample();
        InvokeProcessor.process(example);
    }

    private static void runDefaultTask() {
        System.out.println("\nЗадание 2: @Default");
        DefaultExample.printDefault();
    }

    private static void runToStringTask() {
        System.out.println("\nЗадание 3: @ToString");
        ToStringExample example = new ToStringExample();
        System.out.println("Результат: " + example.buildString());
    }

    private static void runValidateTask() {
        System.out.println("\nЗадание 4: @Validate");
        for (Class<?> clazz : ValidateProcessor.process(ValidateExample.class)) {
            System.out.println("Проверяемый класс: " + clazz.getName());
        }
    }

    private static void runTwoTask() {
        System.out.println("\nЗадание 5: @Two");
        TwoExample.printValues();
    }

    private static void runCacheTask() {
        System.out.println("\nЗадание 6: @Cache");
        CacheExample.printCache();
    }
}
