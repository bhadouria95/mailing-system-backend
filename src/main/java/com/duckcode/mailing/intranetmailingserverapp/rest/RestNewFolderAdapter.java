package com.duckcode.mailing.intranetmailingserverapp.rest;

import com.duckcode.mailing.intranetmailingserverapp.bean.NewFolder;
import com.duckcode.mailing.intranetmailingserverapp.services.NewFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/new-folder")
public class RestNewFolderAdapter {

    @Autowired
    NewFolderService newFolderService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewFolder(NewFolder newFolder) {
        return newFolderService.addNewFolder(newFolder);
    }
}
