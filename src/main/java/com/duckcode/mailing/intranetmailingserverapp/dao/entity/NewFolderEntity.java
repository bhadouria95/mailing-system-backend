package com.duckcode.mailing.intranetmailingserverapp.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class NewFolderEntity {

    @Id
    @GeneratedValue
    private Long id;
    private int mid;
    private String mfrom;
    private String mto;
    private String sub;
    private String mcc;
    private Long mdata;
    private String folder;
    private int mailst;
    private String maildate;

    public NewFolderEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMfrom() {
        return mfrom;
    }

    public void setMfrom(String mfrom) {
        this.mfrom = mfrom;
    }

    public String getMto() {
        return mto;
    }

    public void setMto(String mto) {
        this.mto = mto;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public Long getMdata() {
        return mdata;
    }

    public void setMdata(Long mdata) {
        this.mdata = mdata;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public int getMailst() {
        return mailst;
    }

    public void setMailst(int mailst) {
        this.mailst = mailst;
    }

    public String getMaildate() {
        return maildate;
    }

    public void setMaildate(String maildate) {
        this.maildate = maildate;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewFolderEntity newFolder = (NewFolderEntity) o;
        return Objects.equals(id, newFolder.id) &&
                Objects.equals(mid, newFolder.mid) &&
                Objects.equals(mfrom, newFolder.mfrom) &&
                Objects.equals(mto, newFolder.mto) &&
                Objects.equals(sub, newFolder.sub) &&
                Objects.equals(mcc, newFolder.mcc) &&
                Objects.equals(mdata, newFolder.mdata) &&
                Objects.equals(folder, newFolder.folder) &&
                Objects.equals(mailst, newFolder.mailst) &&
                Objects.equals(maildate, newFolder.maildate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mid, mfrom, mto, sub, mcc, mdata, folder, mailst, maildate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", mId=" + mid + '\'' +
                ", mFrom=" + mfrom + '\'' +
                ", mTo=" + mto + '\'' +
                ", sub=" + sub + '\'' +
                ", mcc=" + mcc + '\'' +
                ", mailDate=" + maildate + '\'' +
                '}';

    }
}
