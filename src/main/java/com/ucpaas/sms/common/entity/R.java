package com.ucpaas.sms.common.entity;

import java.util.HashMap;

/**
 * Created by lpjLiu on 2017/6/2.
 */
public class R extends HashMap<String, Object> {

	public R() {
		put("code", 0);
	}

	public static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R error(String msg) {
		return error(500, msg);
	}

	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}

	public static R ok(String msg, Object data) {
		R r = new R();
		r.put("msg", msg);
		r.put("data", data);
		return r;
	}

	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
