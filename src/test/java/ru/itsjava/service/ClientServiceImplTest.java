package ru.itsjava.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class ClientServiceImplTest {
    public static final String DEFOULT_NAME = "Honor";
    public static final int DEFAULT_PRICE = 25_000;
    List<Phone> phoneList = new ArrayList<>();

    @DisplayName("Проверка метода buyPhone")
    @Test
    public void checkBuyPhoneMethod() {
        Phone actualPhone = new Phone(DEFOULT_NAME, DEFAULT_PRICE);
        Assertions.assertTrue(phoneList.add(actualPhone));
    }

    @DisplayName("Проверка метода putPhone")
    @Test
    public void checkPutPhoneMethod() {
        Phone actualPhone = new Phone(DEFOULT_NAME, DEFAULT_PRICE);
        Assertions.assertTrue(phoneList.add(actualPhone));
    }

    @DisplayName("Проверка метода printPhones")
    @Test
    public void checkPrintPhoneMethod() {
        Phone actualPhone = new Phone(DEFOULT_NAME, DEFAULT_PRICE);
        phoneList.add(actualPhone);
        Assertions.assertEquals(actualPhone, phoneList.get(0));
    }
}
