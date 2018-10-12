package com.youziku_plus.sdk.client;

import com.youziku_plus.sdk.client.BaseServicePlusClient;
import com.youziku_plus.sdk.builder.PlusParamBuilder;
 
import com.youziku_plus.sdk.core.HttpProtocolHandler;
import com.youziku_plus.sdk.core.JsonHandler;
import com.youziku_plus.sdk.common.ServicePlusMethod;
import com.youziku_plus.sdk.config.YouzikuConfigPlus;
import com.youziku_plus.sdk.param.RamUnicodeFontApiParam;
import com.youziku_plus.sdk.param.RamUnicodeScopeFontApiParam;
import com.youziku_plus.sdk.result.RamUnicodeItemResult;

/**
 * 有字库service-高级版接口客户端
 * @author bing-pc
 *
 */
public class YouzikuServicePlusClient extends BaseServicePlusClient implements IYouzikuServicePlusClient {

	
	private YouzikuConfigPlus _config;
	
	 /**构建一个YouzikuServicePlusClient
	  
	  * @param config config
	  */
	public YouzikuServicePlusClient(YouzikuConfigPlus config) {
		if (config == null)
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " instance is null!");
		if (config.getHost() == null || "".equals(config.getHost()))
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " field url is null or Empty!");
		if (config.getApiKey() == null || "".equals(config.getApiKey()))
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " field apiKey is null or Empty!");
		try {
			if (config.getHttpHandler() == null) {
				config.setHttpHandler((HttpProtocolHandler) Class.forName(
						"com.youziku_plus.sdk.core.HttpClientHandler").newInstance());
			}
			if (config.getJsonHandler() == null)
				config.setJsonHandler((JsonHandler) Class.forName(
						"com.youziku_plus.sdk.core.FastJsonHandler").newInstance());
		} catch (InstantiationException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		}
		this._config = config;
	}

	/**
	 * 构造一个YouzikuServicePlusClient
	 * @author gaobing
	 * @param apiKey ApiKey
	 * @param useHttps 标识是否启用https
	 */
	public YouzikuServicePlusClient(String apiKey, boolean useHttps) {
		YouzikuConfigPlus config = new YouzikuConfigPlus();
		if (useHttps) {
			config.useHttps();
		}
		config.setApiKey(apiKey);
		if (config.getHost() == null || "".equals(config.getHost()))
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " field url is null or Empty!");
		if (config.getApiKey() == null || "".equals(config.getApiKey()))
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " field apiKey is null or Empty!");
		try {
			if (config.getHttpHandler() == null) {
				config.setHttpHandler((HttpProtocolHandler) Class.forName(
						"com.youziku_plus.sdk.core.HttpClientHandler").newInstance());
			}
			if (config.getJsonHandler() == null)
				config.setJsonHandler((JsonHandler) Class.forName(
						"com.youziku_plus.sdk.core.FastJsonHandler").newInstance());
		} catch (InstantiationException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		}
		this._config = config;
	}

	/**
	 * 构造一个YouzikuServicePlusClient ,Host默认为 http://service.youziku.com	 
	 * @param apiKey apiKey
	 */
	public YouzikuServicePlusClient(String apiKey) {
		if (apiKey == null || "".equals(apiKey))
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " field apiKey is null or Empty!");
		_config = new YouzikuConfigPlus();
		_config.setApiKey(apiKey);
		_config.setHost("http://service.youziku.com");
		try {
			_config.setHttpHandler((HttpProtocolHandler) Class.forName(
					"com.youziku_plus.sdk.core.HttpClientHandler").newInstance());
			_config.setJsonHandler((JsonHandler) Class.forName(
					"com.youziku_plus.sdk.core.FastJsonHandler").newInstance());
		} catch (InstantiationException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		}
	}

	/**
	 * 构造一个YouzikuServicePlusClient
	 * 
	 * @param apiKey apiKey
	 * @param host host
	 */
	public YouzikuServicePlusClient(String host, String apiKey) {
		this(apiKey);
		if (host == null || "".equals(host))
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " field url is null or Empty!");
		_config.setHost(host);
		try {
			_config.setHttpHandler((HttpProtocolHandler) Class.forName(
					"com.youziku_plus.sdk.core.HttpClientHandler").newInstance());
			_config.setJsonHandler((JsonHandler) Class.forName(
					"com.youziku_plus.sdk.core.FastJsonHandler").newInstance());
		} catch (InstantiationException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e.fillInStackTrace());
		}
	}

	/**
	 * 构造一个YouzikuServicePlusClient
	 * 
	 * @param apiKey
	 *            apiKey
	 * @param httpHandler
	 *            http请求处理程序
	 * @param jsonHandler
	 *            json转换javaBean处理程序
	 */
	public YouzikuServicePlusClient(String apiKey, HttpProtocolHandler httpHandler,
			JsonHandler jsonHandler) {
		if (apiKey == null || "".equals(apiKey))
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " field apiKey is null or Empty!");
		if (httpHandler == null)
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " field httpHandler is null or Empty!");
		if (jsonHandler == null)
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " field jsonHandler is null or Empty!");
		_config = new YouzikuConfigPlus();
		_config.setApiKey(apiKey);
		_config.setHost("http://service.youziku.com");
		_config.setHttpHandler(httpHandler);
		_config.setJsonHandler(jsonHandler);
	}

	/**
	 * 构造一个YouzikuServicePlusClient
	 * 
	 * @param apiKey
	 *            apiKey
	 * @param host
	 *            接口地址
	 * @param httpHandler
	 *            http请求处理程序
	 * @param jsonHandler
	 *            json转换javaBean处理程序
	 */
	public YouzikuServicePlusClient(String apiKey, String host,HttpProtocolHandler httpHandler, JsonHandler jsonHandler) {
	
		this(apiKey, httpHandler, jsonHandler);
		if (host == null || "".equals(host))
			throw new IllegalArgumentException(YouzikuConfigPlus.class.getName()
					+ " field url is null or Empty!");
		_config.setHost(host);
	}
	@Override
	public RamUnicodeItemResult getFontFace(RamUnicodeFontApiParam fontFace) {
		// TODO Auto-generated method stub
		String paramStr = PlusParamBuilder.getFontface(fontFace, _config);
		return commonGetFontFace(paramStr, _config.getHost()
				+ ServicePlusMethod.WebFont.GetFontface, _config,
				RamUnicodeItemResult.class);
	}

	@Override
	public RamUnicodeItemResult getWoffFontFace(RamUnicodeFontApiParam fontFace) {
		// TODO Auto-generated method stub
				String paramStr = PlusParamBuilder.getFontface(fontFace, _config);
				return commonGetFontFace(paramStr, _config.getHost()
						+ ServicePlusMethod.WebFont.GetWoffFontFace, _config,
						RamUnicodeItemResult.class);
	}

	@Override
	public RamUnicodeItemResult getScopeFontFace(
			RamUnicodeScopeFontApiParam fontFace) {
		// TODO Auto-generated method stub
		String paramStr = PlusParamBuilder.getScopeFontface(fontFace, _config);
		return commonGetFontFace(paramStr, _config.getHost()
				+ ServicePlusMethod.WebFont.GetScopeFontface, _config,
				RamUnicodeItemResult.class);
	}

	@Override
	public RamUnicodeItemResult getScopeWoffFontFace(
			RamUnicodeScopeFontApiParam fontFace) {
		// TODO Auto-generated method stub
				String paramStr = PlusParamBuilder.getScopeFontface(fontFace, _config);
				return commonGetFontFace(paramStr, _config.getHost()
						+ ServicePlusMethod.WebFont.GetScopeWoffFontFace, _config,
						RamUnicodeItemResult.class);
	}

}
