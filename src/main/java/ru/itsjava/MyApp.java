package ru.itsjava;

import ru.itsjava.service.StoreService;
import ru.itsjava.service.StoreServiceImpl;

public class MyApp {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl();
        storeService.start();
    }
}
