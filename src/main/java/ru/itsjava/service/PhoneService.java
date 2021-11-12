package ru.itsjava.service;

import ru.itsjava.domain.Phone;

public interface PhoneService {
    Phone takePhoneByFirm(String firm);

    boolean putPhone(Phone phone);
    boolean hasPhone(String firm);
    Object printPhones();
}
