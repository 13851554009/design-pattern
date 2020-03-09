package com.example.demo.structured.adapter;

import com.example.demo.structured.adapter.logOnAdapter.QQLogin;
import com.example.demo.structured.adapter.logOnAdapter.WXLogin;

import java.util.HashMap;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
	  ILogin logOn = new LoginImpl();
	  logOn.login("name","password");

	  Map map = new HashMap();
	  map.put("openId", "wqeqweqecqweq");
	  WXLogin wxLogOn = new WXLogin();
	  wxLogOn.login(map);

	  QQLogin qqLogOn = new QQLogin();
	  qqLogOn.login(map);
  }
}
