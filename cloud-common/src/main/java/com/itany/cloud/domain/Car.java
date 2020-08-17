package com.itany.cloud.domain;

public class Car {
    private String no;
    private String brand;
    private String type;
    private static Car[] cars;

    public Car() {
    }

    public Car(String no, String brand, String type) {
        this.no = no;
        this.brand = brand;
        this.type = type;
    }

    static {
        cars = new Car[]{
         new Car("1001","轿车","奥迪Q3")
        ,new Car("1002","轿车","奥迪Q7")
        ,new Car("1003","轿车","宝马X3")
        ,new Car("1004","轿车","奥拓A1")};
    }
    public Car[] getCars(){
        return cars;
    }

    public int getRent(String types,int day){
        if(types.equals("奥迪Q3")){
            return day*500;
        }else if(types.equals("奥迪Q7")){
            return day*600;
        }else if(types.equals("宝马X3")){
            return day*400;
        }else if(types.equals("奥拓A1")){
            return day*200;
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

    public static void setCars(Car[] cars) {
        Car.cars = cars;
    }
}
