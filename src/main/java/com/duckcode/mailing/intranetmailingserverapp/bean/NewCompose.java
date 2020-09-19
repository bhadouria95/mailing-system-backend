package com.duckcode.mailing.intranetmailingserverapp.bean;

public class NewCompose {
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

    public NewCompose() {}

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

}
