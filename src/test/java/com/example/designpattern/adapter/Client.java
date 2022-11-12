package com.example.designpattern.adapter;

import org.junit.jupiter.api.Test;

public class Client {

    @Test
    void 휘발유() {
        final Engine engineVehicle = new EngineVehicle();
        Electronic electronic = new EngineAdapter(engineVehicle);

        electronic.charge();
        electronic.stop();
    }
}
