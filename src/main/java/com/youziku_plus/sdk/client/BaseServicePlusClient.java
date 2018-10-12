package com.youziku_plus.sdk.client;

import com.youziku_plus.sdk.config.YouzikuConfigPlus;



/**
 * BaseServiceClient
 * @author bing-pc
 *
 */
public class BaseServicePlusClient {
	
	/**
	 * 通用请求GetFontFace
	 * @author gaobing
	 * @param param 请求参数
	 * @param url 接口路径
	 * @param config config
	 * @param clazz  clazz
	 * @param <T> t
	 * @return 对象
	 */
	protected <T> T commonGetFontFace(String param,String url,YouzikuConfigPlus config,Class<T> clazz){
		try {
			String response = config.getHttpHandler().request(url, param, config.getTimeOut()*60*1000);
			return config.getJsonHandler().parseObject(response, clazz);
		} catch (Exception e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		}
	}
	 
}