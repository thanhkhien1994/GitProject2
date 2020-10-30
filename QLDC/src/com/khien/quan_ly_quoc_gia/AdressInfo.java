package com.khien.quan_ly_quoc_gia;

public class AdressInfo {
    private int homeID;
    private String streetName;
    private String kv;
    private String commune;
    private String district;
    private String province;

    public AdressInfo() {
    }

    public AdressInfo(int homeID, String streetName, String kv, String commune, String district, String province) {
        this.homeID = homeID;
        this.streetName = streetName;
        this.kv = kv;
        this.commune = commune;
        this.district = district;
        this.province = province;
    }

    public int getHomeID() {
        return homeID;
    }

    public void setHomeID(int homeID) {
        this.homeID = homeID;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getKv() {
        return kv;
    }

    public void setKv(String kv) {
        this.kv = kv;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
