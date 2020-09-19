package com.duckcode.mailing.intranetmailingserverapp.rest;

import com.duckcode.mailing.intranetmailingserverapp.bean.Folder;
import com.duckcode.mailing.intranetmailingserverapp.services.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/rest-folder")
public class RestFolderAdapter {

    @Autowired
    FolderService folderService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addFolder(Folder folder) {
        return folderService.addFolder(folder);
    }
}
