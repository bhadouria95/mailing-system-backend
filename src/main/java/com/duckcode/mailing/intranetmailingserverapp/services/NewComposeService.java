package com.duckcode.mailing.intranetmailingserverapp.services;

import com.duckcode.mailing.intranetmailingserverapp.bean.NewCompose;
import com.duckcode.mailing.intranetmailingserverapp.dao.entity.NewComposeEntity;
import org.springframework.stereotype.Service;

@Service
public class NewComposeService {

    public NewComposeService() {}

    public String addNewCompose(NewCompose newCompose) {
        NewComposeEntity newComposeEntity = new NewComposeEntity();
        newComposeEntity.setMailid(newCompose.getMailid());
        newComposeEntity.setMailfrom(newCompose.getMailfrom());
        newComposeEntity.setMailto(newCompose.getMailto());
        newComposeEntity.setSubject(newCompose.getSubject());
        newComposeEntity.setMailcc(newCompose.getMailcc());
        newComposeEntity.setMailbcc(newCompose.getMailbcc());
        newComposeEntity.setMailexch(newCompose.getMailexch());
        newComposeEntity.setMaildata(newCompose.getMaildata());
        newComposeEntity.setFolder(newCompose.getFolder());
        newComposeEntity.setMaildate(newCompose.getMaildate());
        newComposeEntity.setMaillist(newCompose.getMaillist());
        return newComposeEntity.toString();
    }
}
