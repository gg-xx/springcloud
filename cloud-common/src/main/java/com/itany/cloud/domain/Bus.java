package com.itany.cloud.domain;

public class Bus {
    private String no;
    private String brand;
    private String type;

    private static Bus[] buss;

    public Bus() {
    }

    public Bus(String no, String brand, String type) {
        this.no = no;
        this.brand = brand;
        this.type = type;
    }

    static {
        buss = new Bus[]{
                new Bus("2001","小车","金杯")
                ,new Bus("2002","小车","金龙")};
    }
    public Bus[] getBuss(){
        return buss;
    }

    public int getRent(String type2,int day){
        if("金杯".equals(type2)){
            return day*800;
        }else if("金龙".equals(type2)){
            return day*1200;
        }
        return 0;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void setBuss(Bus[] buss) {
        Bus.buss = buss;
    }
}
