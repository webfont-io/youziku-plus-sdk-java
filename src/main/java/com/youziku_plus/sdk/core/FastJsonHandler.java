package com.youziku_plus.sdk.core;

import com.alibaba.fastjson.JSON;
import com.youziku_plus.sdk.core.JsonHandler;


/**
 * 使用alibaba JSON开发包
 * @author gaobing
 *
 */
public class FastJsonHandler implements JsonHandler {

	/**
	 * 转换JSON对象
	 * @return json对象
	 */
	public <T> T parseObject(String text, Class<T> clazz) {
		return JSON.parseObject(text, clazz);
	}

}