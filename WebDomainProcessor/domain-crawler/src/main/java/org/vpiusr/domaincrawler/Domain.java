package org.vpiusr.domaincrawler;

import java.io.Serializable;

public class Domain implements Serializable {

    String domain;
    String create_date;
    String update_date;
    String country;
    boolean isDead;
    String A;
    String NS;
    String CNAME;
    String MX;
    String TXT;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getNS() {
        return NS;
    }

    public void setNS(String NS) {
        this.NS = NS;
    }

    public String getCNAME() {
        return CNAME;
    }

    public void setCNAME(String CNAME) {
        this.CNAME = CNAME;
    }

    public String getMX() {
        return MX;
    }

    public void setMX(String MX) {
        this.MX = MX;
    }

    public String getTXT() {
        return TXT;
    }

    public void setTXT(String TXT) {
        this.TXT = TXT;
    }


}
