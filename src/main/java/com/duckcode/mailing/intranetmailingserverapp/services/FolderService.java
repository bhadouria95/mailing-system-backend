package com.duckcode.mailing.intranetmailingserverapp.services;

import com.duckcode.mailing.intranetmailingserverapp.bean.Folder;
import com.duckcode.mailing.intranetmailingserverapp.dao.entity.FoldersEntity;
import org.springframework.stereotype.Service;

@Service
public class FolderService {

    public FolderService() {}

    public String addFolder(Folder folder) {
        FoldersEntity foldersEntity = new FoldersEntity();
        foldersEntity.setUsername(folder.getUsername());
        foldersEntity.setFolder(folder.getFolder());
        return foldersEntity.toString();
    }
}
