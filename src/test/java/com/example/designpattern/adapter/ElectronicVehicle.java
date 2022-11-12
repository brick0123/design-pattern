package com.example.designpattern.adapter;

public class ElectronicVehicle implements Electronic {

    @Override
    public void charge() {
        System.out.println("전기차 충전");
    }

    @Override
    public void stop() {
        System.out.println("전기차 스톱");
    }
}
