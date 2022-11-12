package com.example.designpattern.adapter;

public class EngineAdapter implements Electronic {

    private final Engine engine;

    public EngineAdapter(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void charge() {
        engine.fillUp();
    }

    @Override
    public void stop() {
        engine.stop();
    }
}
