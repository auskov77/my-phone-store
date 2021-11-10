package ru.itsjava.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneServiceImplTest {
    List<Phone> phoneList = new ArrayList<>(); // создаем коллекцию phoneList
    public static final String DEFAULT_NAME_1 = "Honor"; // создаем параметр DEFAULT_NAME_1
    public static final int DEFAULT_PRICE_1 = 25_000; // создаем параметр DEFAULT_PRICE_1

    @Test
    @DisplayName("Проверка метода takePhoneByFirm")
    void takePhoneByFirm() {
        Phone actualPhone = new Phone(DEFAULT_NAME_1, DEFAULT_PRICE_1); // создаем объект actualPhone с переменными (DEFAULT_NAME_1, DEFAULT_PRICE_1)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone
        PhoneServiceImpl phoneService = new PhoneServiceImpl(phoneList); // создаем объект phoneService от класса PhoneServiceImpl с переменной phoneList
        Assertions.assertEquals(actualPhone, phoneService.takePhoneByFirm(DEFAULT_NAME_1)); // проверяем равенство двух объектов: ожидаем actualPhone, фактический результат: метод takePhoneByFirm объекта phoneService
    }

    @Test
    @DisplayName("Проверка метода putPhone")
    void putPhone() {
        Phone actualPhone_1 = new Phone(DEFAULT_NAME_1, DEFAULT_PRICE_1); // создаем объект actualPhone_1 с переменными (DEFAULT_NAME_1, DEFAULT_PRICE_1)
        phoneList.add(actualPhone_1); // в коллекцию phoneList добавили объект actualPhone_1
        Assertions.assertEquals(actualPhone_1, phoneList.get(0)); // проверяем равенство двух обхектов: ожидание - actualPhone_1, фактический результат - получить позицию 0 коллекции phoneList
    }

    @Test
    @DisplayName("Проверка метода hasPhone")
    void hasPhone() {
        Phone actualPhone = new Phone(DEFAULT_NAME_1, DEFAULT_PRICE_1);  // создаем объект actualPhone_1 с переменными (DEFAULT_NAME_1, DEFAULT_PRICE_1)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone_1
        Assertions.assertTrue(phoneList.contains(actualPhone)); // проверяем что передаваемое выражение истинно, т.е в коллекции phoneList содержится объект actualPhone
    }

    @Test
    @DisplayName("Проверка метода printPhones")
    void printPhones() {
        Phone actualPhone = new Phone(DEFAULT_NAME_1, DEFAULT_PRICE_1);  // создаем объект actualPhone_1 с переменными (DEFAULT_NAME_1, DEFAULT_PRICE_1)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone_1
        Assertions.assertEquals(actualPhone, phoneList.get(0)); // проверяем равенство двух обхектов: ожидание - actualPhone_1, фактический результат - получить позицию 0 коллекции phoneList
    }
}
