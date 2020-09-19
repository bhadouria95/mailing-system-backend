package com.duckcode.mailing.intranetmailingserverapp.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class NewComposeEntity {

    @Id
    @GeneratedValue
    private Long id;
    private int mailid;
    private String mailfrom;
    private String mailto;
    private String subject;
    private String mailcc;
    private String mailbcc;
    private String mailexch;
    private String maildata;
    private String folder;
    private String maildate;
    private int maillist;

    public NewComposeEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMailid() {
        return mailid;
    }

    public void setMailid(int mailid) {
        this.mailid = mailid;
    }

    public String getMailfrom() {
        return mailfrom;
    }

    public void setMailfrom(String mailfrom) {
        this.mailfrom = mailfrom;
    }

    public String getMailto() {
        return mailto;
    }

    public void setMailto(String mailto) {
        this.mailto = mailto;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMailcc() {
        return mailcc;
    }

    public void setMailcc(String mailcc) {
        this.mailcc = mailcc;
    }

    public String getMailbcc() {
        return mailbcc;
    }

    public void setMailbcc(String mailbcc) {
        this.mailbcc = mailbcc;
    }

    public String getMailexch() {
        return mailexch;
    }

    public void setMailexch(String mailexch) {
        this.mailexch = mailexch;
    }

    public String getMaildata() {
        return maildata;
    }

    public void setMaildata(String maildata) {
        this.maildata = maildata;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getMaildate() {
        return maildate;
    }

    public void setMaildate(String maildate) {
        this.maildate = maildate;
    }

    public int getMaillist() {
        return maillist;
    }

    public void setMaillist(int maillist) {
        this.maillist = maillist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewComposeEntity mail = (NewComposeEntity) o;
        return Objects.equals(id, mail.id) &&
                Objects.equals(mailid, mail.mailid) &&
                Objects.equals(mailfrom, mail.mailfrom) &&
                Objects.equals(mailto, mail.mailto) &&
                Objects.equals(subject, mail.subject) &&
                Objects.equals(mailcc, mail.mailcc) &&
                Objects.equals(mailbcc, mail.mailbcc) &&
                Objects.equals(mailexch, mail.mailexch) &&
                Objects.equals(maildata, mail.maildata) &&
                Objects.equals(folder, mail.folder) &&
                Objects.equals(maildate, mail.maildate) &&
                Objects.equals(maillist, mail.maillist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mailid, mailto, mailfrom,
                subject, mailcc, mailbcc, mailexch,
                maildata, folder, maildate, maillist);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", mailId=" + mailid + '\'' +
                ", mailFrom=" + mailfrom + '\'' +
                ", mailTo=" + mailto + '\'' +
                ", mailDate=" + maildate + '\'' +
                ", mailList=" + maillist + '\'' +
                '}';

    }
}
