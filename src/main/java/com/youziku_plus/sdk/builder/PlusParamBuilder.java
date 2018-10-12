package com.youziku_plus.sdk.builder;

import com.youziku_plus.sdk.config.YouzikuConfigPlus;
import com.youziku_plus.sdk.param.RamUnicodeFontApiParam;
import com.youziku_plus.sdk.param.RamUnicodeScopeFontApiParam;
import com.youziku_plus.sdk.vlidate.PlusParamValidate;
 

/**
 * 请求参数构造器
 * @author gaobing
 *
 */
public class PlusParamBuilder {

	
	/**
	 * 将FontFace对象转换为HTTP请求参数
	 * @param fontFace fontFace
	 * @author gaobing
	 * @param config config
	 * @return 请求参数
	 */
	public static String getFontface(RamUnicodeFontApiParam fontFace,YouzikuConfigPlus config){
		PlusParamValidate.GetFontface(fontFace);
		StringBuffer sb = new StringBuffer("ApiKey=");
		sb.append(config.getApiKey());
		sb.append("&AccessKey=");
		sb.append(fontFace.getAccessKey());
		sb.append("&Content=");
		sb.append(fontFace.getContent().replaceAll("&", ""));
		sb.append("&Tag=");
		sb.append(fontFace.getTag());
		sb.append("&UseRanFontFamily=");
		sb.append(fontFace.getUseRanFontFamily());
		sb.append("&Option[RanNumber]=");
		sb.append(fontFace.getOption().isRanNumber());
		sb.append("&Option[RanEnglish]=");
		sb.append(fontFace.getOption().isRanEnglish());
		sb.append("&Option[RanChinese]=");
		sb.append(fontFace.getOption().isRanChinese());
		return sb.toString();
	}
	/**
	 * 将FontFace对象转换为HTTP请求参数
	 * @param fontFace fontFace
	 * @author gaobing
	 * @param config config
	 * @return 请求参数
	 */
	public static String getScopeFontface(RamUnicodeScopeFontApiParam fontFace,YouzikuConfigPlus config){
		PlusParamValidate.GetFontface(fontFace);
		StringBuffer sb = new StringBuffer("ApiKey=");
		sb.append(config.getApiKey());
		sb.append("&AccessKey=");
		sb.append(fontFace.getAccessKey());
		sb.append("&Content=");
		sb.append(fontFace.getContent().replaceAll("&", ""));
		sb.append("&Tag=");
		sb.append(fontFace.getTag());
		sb.append("&Text=");
		sb.append(fontFace.getText());
		sb.append("&UseRanFontFamily=");
		sb.append(fontFace.getUseRanFontFamily());
		sb.append("&Option[RanNumber]=");
		sb.append(fontFace.getOption().isRanNumber());
		sb.append("&Option[RanEnglish]=");
		sb.append(fontFace.getOption().isRanEnglish());
		sb.append("&Option[RanChinese]=");
		sb.append(fontFace.getOption().isRanChinese());
		return sb.toString();
	}
}
