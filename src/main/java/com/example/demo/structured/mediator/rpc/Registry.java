package com.example.demo.structured.mediator.rpc;

import java.util.HashMap;
import java.util.Map;

public class Registry{
    private Map<String, ISay> map = new HashMap<>();

    public void regist(String name, ISay iSay){
        map.put(name, iSay);
    }

    public void work(String name, String msg){
        map.get(name).get(msg);
    }

}
