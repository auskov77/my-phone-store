package ru.itsjava.service;

import ru.itsjava.domain.Client;
import ru.itsjava.domain.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше ФИО");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Apple", 40_000));
        phoneList.add(new Phone("Xiaomi", 16_000));

        PhoneService phoneService = new PhoneServiceImpl(phoneList);

        ClientService clientService =
                new ClientServiceImpl(client, scanner, phoneService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();
    }
}
