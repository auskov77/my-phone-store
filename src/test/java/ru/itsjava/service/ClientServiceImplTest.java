package ru.itsjava.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class ClientServiceImplTest {
    public static final String DEFAULT_NAME = "Honor"; // создаем параметр DEFAULT_NAME
    public static final int DEFAULT_PRICE = 25_000; // создаем параметр DEFAULT_PRICE
    List<Phone> phoneList = new ArrayList<>(); // создаем коллекцию phoneList

    @DisplayName("Проверка метода buyPhone")
    @Test
    public void checkBuyPhoneMethod() {
        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE); // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
        phoneList.add(actualPhone);  // в коллекцию phoneList добавили объект actualPhone
        Assertions.assertTrue(phoneList.contains(actualPhone)); // проверяем что передаваемое выраежение истинно: т.е. в коллекции phoneList содержится объект actualPhone
    }

    @DisplayName("Проверка метода putPhone")
    @Test
    public void checkPutPhoneMethod() {
        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE); // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone
        Assertions.assertTrue(phoneList.contains(actualPhone)); // проверяем что передаваемое выраежение истинно: т.е. в коллекции phoneList содержится объект actualPhone
    }

    @DisplayName("Проверка метода printPhones")
    @Test
    public void checkPrintPhoneMethod() {
        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE); // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone
        Assertions.assertEquals(actualPhone, phoneList.get(0)); // проверяем равенство двух обхектов: ожидание - actualPhone, фактический результат - получить позицию 0 коллекции phoneList
    }
}
