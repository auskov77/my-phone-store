package ru.itsjava.service;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Client;
import ru.itsjava.domain.Phone;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final PhoneService phoneService;

    @Override
    public void buyPhone() {
        System.out.println("Введите название телефона");
        String firm = scanner.next();
        if (phoneService.hasPhone(firm)) {
            System.out.println("Покупаем телефон ...");
            phoneService.takePhoneByFirm(firm);
            System.out.println("Купили телефон " + firm);
        } else {
            System.out.println("Не смогли купить телефон. Такого телефона нет");
        }
    }

    @Override
    public void putPhone() {
        System.out.println("Введите название телефона");
        String firm = scanner.next();

        System.out.println("Введите стоимость телефона");
        int price = scanner.nextInt();

        Phone phone = new Phone(firm, price);
        phoneService.putPhone(phone);
    }

    @Override
    public void printPhones() {
        System.out.println("Уважвемый " + client.getName());
        System.out.println("Вот наши телефоны: ");
        phoneService.printPhones();

    }
}
