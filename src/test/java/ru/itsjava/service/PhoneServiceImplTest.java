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
    void shouldCorrectMethodTakePhoneByFirm() {
        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE); // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone
        PhoneServiceImpl phoneService = new PhoneServiceImpl(phoneList); // создаем объект phoneService от класса PhoneServiceImpl с переменной phoneList
        Assertions.assertEquals(actualPhone, phoneService.takePhoneByFirm(DEFAULT_NAME)); // проверяем равенство двух объектов: ожидаем actualPhone, фактический результат: метод takePhoneByFirm объекта phoneService
    }

    @Test
    @DisplayName("Проверка метода putPhone")
    void shouldCorrectMethodPutPhone() {
        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE); // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone
//        Assertions.assertTrue(phoneList.contains(actualPhone)); // проверяем что передаваемое выражение истинно, т.е в коллекции phoneList содержится объект actualPhone
        PhoneServiceImpl phoneService = new PhoneServiceImpl(phoneList);
        Assertions.assertFalse(phoneService.putPhone(actualPhone));
    }

    @Test
    @DisplayName("Проверка метода hasPhone")
    void shouldCorrectMethodHasPhone() {
        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE);  // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone
        PhoneServiceImpl phoneService = new PhoneServiceImpl(phoneList);
        Assertions.assertTrue(phoneService.hasPhone(DEFAULT_NAME));
    }

//    @Test
//    @DisplayName("Проверка метода printPhones")
//    void shouldCorrectMethodPrintPhones() {
//        Phone actualPhone = new Phone(DEFAULT_NAME, DEFAULT_PRICE);  // создаем объект actualPhone с переменными (DEFAULT_NAME, DEFAULT_PRICE)
//        phoneList.add(actualPhone); // в коллекцию phoneList добавили объект actualPhone
//        PhoneServiceImpl phoneService = new PhoneServiceImpl(phoneList);
//        Assertions.assertNull(phoneService.printPhones());
//    }
}
