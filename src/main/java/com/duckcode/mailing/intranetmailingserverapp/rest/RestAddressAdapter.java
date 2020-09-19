package com.duckcode.mailing.intranetmailingserverapp.rest;

import com.duckcode.mailing.intranetmailingserverapp.bean.Address;
import com.duckcode.mailing.intranetmailingserverapp.services.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/address")
public class RestAddressAdapter {

    @Autowired
    AddressService addressService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addAddress(Address address) {
        return addressService.addAddress(address);
    }
}
