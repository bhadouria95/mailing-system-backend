package com.duckcode.mailing.intranetmailingserverapp.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class AddressEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String actname;
    private String nickname;
    private String emailId;
    private String addresses;
    private int phone;

    public AddressEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity address = (AddressEntity) o;
        return Objects.equals(id, address.id) &&
                Objects.equals(actname, address.actname) &&
                Objects.equals(nickname, address.nickname) &&
                Objects.equals(emailId, address.emailId) &&
                Objects.equals(addresses, address.addresses) &&
                Objects.equals(phone, address.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, actname, nickname, emailId, addresses, phone);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", actName=" + actname + '\'' +
                ", nickname=" + nickname + '\'' +
                ", emailId=" + emailId + '\'' +
                ", addresses=" + addresses + '\'' +
                ", phone=" + phone + '\'' +
                '}';

    }

}
