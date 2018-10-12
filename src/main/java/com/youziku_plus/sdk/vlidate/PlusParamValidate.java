package com.youziku_plus.sdk.vlidate;

import com.youziku_plus.sdk.param.RamUnicodeFontApiParam;
import com.youziku_plus.sdk.param.RamUnicodeScopeFontApiParam;



/**
 * 参数验证
 * @author bing-pc
 *
 */
public class PlusParamValidate {
	
	/**
	 * 验证GetFontface
	 * @param param param
	 */
	public static void GetFontface(final RamUnicodeFontApiParam param){
		if(param==null)
			throw new IllegalArgumentException("param is null");
		if(param.getAccessKey()==null||"".equals(param.getAccessKey()))
			throw new IllegalArgumentException("accessKey is null");
		if(param.getContent()==null||"".equals(param.getContent()))
			throw new IllegalArgumentException("content is null");
	}
	
	/**
	 * 验证GetScopeFontface
	 * @param param  param
	 */
	public static void GetScopeFontface(final RamUnicodeScopeFontApiParam param){
		GetFontface(param);
		if(param.getText()==null||"".equals(param.getText()))
			throw new IllegalArgumentException("text is null");
	}
}
