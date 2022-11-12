package com.example.designpattern.adapter;

public class EngineVehicle implements Engine {

    @Override
    public void fillUp() {
        System.out.println("휘발유 충전");
    }

    @Override
    public void stop() {
        System.out.println("끼이이익");
    }
}
