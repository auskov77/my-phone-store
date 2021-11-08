package ru.itsjava.service;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{
    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {
        while (true) {
            printMenu();
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();

            if (menuNum == 1) {
                System.out.println("Вы выбрали купить телефон");
                clientService.buyPhone();
            } else if (menuNum == 2) {
                System.out.println("Вы выбрали отдать телефон");
                clientService.putPhone();
            } else if (menuNum == 3) {
                System.out.println("Печатаем названия телефонов...");
                clientService.printPhones();
            } else {
                System.out.println("До встречи");
                break;
            }
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1 - Купить; 2 - Отдать; 3 - Вывод телефонов; Все остальное - выход");
    }
}
