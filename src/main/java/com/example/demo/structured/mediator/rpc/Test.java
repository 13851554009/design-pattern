package com.example.demo.structured.mediator.rpc;

public class Test {
    public static void main(String[] args) {
        Registry registry = new Registry();
        ISay a = new AISayImpl(registry);
        ISay b = new BISayImpl(registry);
        registry.regist("a", a);
        registry.regist("b", b);

        a.say("b", "hello");

        b.say("a", "hello");

    }
}
