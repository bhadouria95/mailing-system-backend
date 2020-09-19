package com.duckcode.mailing.intranetmailingserverapp.bean;

public class NewFolder {
    private int mid;
    private String mfrom;
    private String mto;
    private String sub;
    private String mcc;
    private Long mdata;
    private String folder;
    private int mailst;
    private String maildate;

    public NewFolder() {}

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

}
