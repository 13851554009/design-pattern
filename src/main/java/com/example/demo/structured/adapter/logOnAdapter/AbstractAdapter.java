package com.example.demo.structured.adapter.logOnAdapter;

import com.example.demo.structured.adapter.ILogin;
import com.example.demo.structured.adapter.LoginImpl;

import java.util.Map;

/**
 * 适配器类
 * */
public abstract class AbstractAdapter implements ILoginAdapter {

	protected ILogin login;

	public AbstractAdapter() {
		this.login = new LoginImpl();
	}

	public abstract Boolean login(Map<String, String> map);
}
