package com.example.demo.structured.adapter.logOnAdapter;

import com.example.demo.structured.adapter.LoginImpl;

import java.util.Map;

/**
 * 适配器的不同实现：WX
 * */
public class WXLogin extends AbstractAdapter {

	@Override
	public Boolean login(Map<String, String> map) {
		String openId = map.get("openId");
		//TODO 验证openid
		return login.login(openId, null);
	}

}
