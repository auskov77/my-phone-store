package ru.itsjava.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneServiceImplTest {
    List<Phone> phoneList = new ArrayList<>(); // создаем коллекцию phoneList
    public static final String DEFAULT_NAME = "Honor"; // создаем параметр DEFAULT_NAME
    public static final int DEFAULT_PRICE = 25_000; // создаем параметр DEFAULT_PRICE

    @Test
    @DisplayName("Проверка метода takePhoneByFirm")
    void takePhoneByFirm() {
        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE); // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone
        PhoneServiceImpl phoneService = new PhoneServiceImpl(phoneList); // создаем объект phoneService от класса PhoneServiceImpl с переменной phoneList
        Assertions.assertEquals(actualPhone, phoneService.takePhoneByFirm(DEFAULT_NAME)); // проверяем равенство двух объектов: ожидаем actualPhone, фактический результат: метод takePhoneByFirm объекта phoneService
    }

    @Test
    @DisplayName("Проверка метода putPhone")
    void putPhone() {
        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE); // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone
        Assertions.assertEquals(actualPhone, phoneList.get(0)); // проверяем равенство двух обхектов: ожидание - actualPhone, фактический результат - получить позицию 0 коллекции phoneList
    }

    @Test
    @DisplayName("Проверка метода hasPhone")
    void hasPhone() {
        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE);  // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone_1
        Assertions.assertTrue(phoneList.contains(actualPhone)); // проверяем что передаваемое выражение истинно, т.е в коллекции phoneList содержится объект actualPhone
    }

    @Test
    @DisplayName("Проверка метода printPhones")
    void printPhones() {
        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE);  // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone
        Assertions.assertEquals(actualPhone, phoneList.get(0)); // проверяем равенство двух обхектов: ожидание - actualPhone, фактический результат - получить позицию 0 коллекции phoneList
    }
}
