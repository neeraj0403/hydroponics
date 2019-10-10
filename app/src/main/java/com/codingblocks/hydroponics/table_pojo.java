package com.codingblocks.hydroponics;

public class table_pojo {
    String plants;
    String ph;
    String ec;
    String ppm;

    public String getPlants() {
        return plants;
    }

    public void setPlants(String plants) {
        this.plants = plants;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public String getPpm() {
        return ppm;
    }

    public void setPpm(String ppm) {
        this.ppm = ppm;
    }

    public table_pojo(String plants, String ph, String ec, String ppm) {
        this.plants = plants;
        this.ph = ph;
        this.ec = ec;
        this.ppm = ppm;
    }
}
