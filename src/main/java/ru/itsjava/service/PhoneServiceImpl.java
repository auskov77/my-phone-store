package ru.itsjava.service;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Phone;

import java.util.List;

@RequiredArgsConstructor
public class PhoneServiceImpl implements PhoneService{
    private final List<Phone> phonesFromStore;

    @Override
    public Phone takePhoneByFirm(String firm) {
        Phone resPhone = null;

        for (Phone phone : phonesFromStore) {
            if (phone.getFirm().equals(firm)) {
                resPhone = phone;
            }
        }
        if (resPhone != null) {
            phonesFromStore.remove(resPhone);
            return resPhone;
        }
        return null;
    }

    @Override
    public boolean putPhone(Phone phone) {
        phonesFromStore.add(phone);
        return true;
    }

    @Override
    public boolean hasPhone(String firm) {
        for (Phone phone: phonesFromStore){
            if (phone.getFirm().equals(firm)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object printPhones() {
        for (Phone phone: phonesFromStore){
            System.out.println(phone.getFirm() + " " + phone.getPrice());
        }
        return null;
    }
}
