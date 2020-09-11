package com.example.demo.structured.mediator.rpc;

public class AISayImpl implements ISay {

    private Registry registry;

    public AISayImpl(Registry registry) {
        this.registry = registry;
    }

    @Override
    public void say(String name, String msg) {
        registry.work(name, msg);
    }

    @Override
    public void get(String msg) {
        System.out.println("a 收到" + " ：" + msg);
    }
}
