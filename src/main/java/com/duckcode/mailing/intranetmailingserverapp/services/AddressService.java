package com.duckcode.mailing.intranetmailingserverapp.services;

import com.duckcode.mailing.intranetmailingserverapp.bean.Address;
import com.duckcode.mailing.intranetmailingserverapp.dao.entity.AddressEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    public AddressService() {}

    public String addAddress(Address address) {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setActname(address.getActname());
        addressEntity.setNickname(address.getNickname());
        addressEntity.setEmailId(address.getEmailId());
        addressEntity.setAddresses(address.getAddresses());
        addressEntity.setPhone(address.getPhone());
        return addressEntity.toString();
    }
}
