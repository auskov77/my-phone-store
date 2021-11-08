package ru.itsjava.service;

import ru.itsjava.domain.Phone;

public interface PhoneService {
    Phone takePhoneByFirm(String firm);

    void putPhone(Phone phone);
    boolean hasPhone(String firm);
    void printPhones();
}
