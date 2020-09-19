package com.duckcode.mailing.intranetmailingserverapp.rest;

import com.duckcode.mailing.intranetmailingserverapp.bean.NewCompose;
import com.duckcode.mailing.intranetmailingserverapp.services.NewComposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "new-compose")
public class RestNewComposeAdapter {

    @Autowired
    NewComposeService newComposeService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewCompose(NewCompose newCompose) {
        return newComposeService.addNewCompose(newCompose);
    }
}
