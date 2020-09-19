package com.duckcode.mailing.intranetmailingserverapp.bean;

public class Address {
    private String actname;
    private String nickname;
    private String emailId;
    private String addresses;
    private int phone;

    public Address() {}

    public String getActname() {
        return actname;
    }

    public void setActname(String actName) {
        this.actname = actName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}

