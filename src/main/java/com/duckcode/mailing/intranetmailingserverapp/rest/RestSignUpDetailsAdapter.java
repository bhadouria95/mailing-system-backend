package com.duckcode.mailing.intranetmailingserverapp.rest;

import com.duckcode.mailing.intranetmailingserverapp.bean.SignUpDetails;
import com.duckcode.mailing.intranetmailingserverapp.services.SignUpDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/sign-up")
public class RestSignUpDetailsAdapter {

    @Autowired
    SignUpDetailsService signUpDetailsService;

    @RequestMapping(value="/", method = RequestMethod.POST)
    void addSignUpDetails(SignUpDetails signUpDetails) {
        signUpDetailsService.addSignUpDetails(signUpDetails);
    }
}
