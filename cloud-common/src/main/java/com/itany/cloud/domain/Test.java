package com.itany.cloud.domain;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入电话：");
        String phone = sc.next();
        User user = new User(name,phone);
        System.out.println("请选择您要租的车辆种类： 1 轿车     2  客车");
        Car car = new Car();
        Bus bus = new Bus();
        Car[] cars = car.getCars();
        Bus[] buss = bus.getBuss();
        String brand = sc.next();
        if ("1".equals(brand)) {
            System.out.println("请 选择 车辆型号 （1.奥迪Q3 2.奥迪Q7 3.宝马X3 4.奥拓A1）");
            String type = sc.next();
            if("1".equals(type)){
                car = cars[0];
            }else if("2".equals(type)){
                car = cars[1];
            }else if("3".equals(type)){
                car = cars[2];
            }else if("4".equals(type)){
                car = cars[3];
            }
        }else if("2".equals(brand)){
            System.out.println("请 选择 车辆型号 （1.金杯 2.金龙 ");
            String type = sc.next();
            if("1".equals(type)){
                bus = buss[0];
            }else if("2".equals(type)){
                bus = buss[1];
            }
        }
        System.out.println("请输入 租赁的天数");
        int day = sc.nextInt();
        System.out.println("客户  "+user+" 您 的租车信息如下：");
        if(car!=null){
            System.out.println("车牌号   "+car.getNo()+"       型号  "+car.getType()+" ");
            System.out.println("共租赁   "+day+"  天   租金为 "+car.getRent(car.getType(),day)+"元 ");
        }else {
            System.out.println("车牌号   "+bus.getNo()+"       型号  "+bus.getType()+" ");
            System.out.println("共租赁   "+day+"  天   租金为 "+bus.getRent(bus.getType(),day)+"元 ");
        }
    }
}
