package com.example.demo.structured.mediator.rpc;

public class BISayImpl implements ISay {

    private Registry registry;

    public BISayImpl(Registry registry) {
        this.registry = registry;
    }

    @Override
    public void say(String name, String msg) {
        registry.work(name, msg);
    }

    @Override
    public void get(String msg) {
        System.out.println("b 收到" + " ：" + msg);
    }


}
