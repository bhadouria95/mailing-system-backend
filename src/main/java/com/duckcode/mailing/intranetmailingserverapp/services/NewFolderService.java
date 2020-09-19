package com.duckcode.mailing.intranetmailingserverapp.services;

import com.duckcode.mailing.intranetmailingserverapp.bean.NewFolder;
import com.duckcode.mailing.intranetmailingserverapp.dao.entity.NewFolderEntity;
import org.springframework.stereotype.Service;

@Service
public class NewFolderService {

    public NewFolderService() {}

    public String addNewFolder(NewFolder newFolder) {
        NewFolderEntity newFolderEntity = new NewFolderEntity();
        newFolderEntity.setMfrom(newFolder.getMfrom());
        newFolderEntity.setMto(newFolder.getMto());
        newFolderEntity.setSub(newFolder.getSub());
        newFolderEntity.setMcc(newFolder.getMcc());
        newFolderEntity.setMdata(newFolder.getMdata());
        newFolderEntity.setFolder(newFolder.getFolder());
        newFolderEntity.setMailst(newFolder.getMailst());
        newFolderEntity.setMaildate(newFolder.getMaildate());
        return newFolderEntity.toString();
    }
}
