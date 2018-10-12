package com.youziku_plus.sdk.client;

import com.youziku_plus.sdk.param.RamUnicodeFontApiParam;
import com.youziku_plus.sdk.param.RamUnicodeScopeFontApiParam;
import com.youziku_plus.sdk.result.RamUnicodeItemResult;

/**
 * 有字库service-高级版接口客户端
 * @author bing-pc
 *
 */
public interface IYouzikuServicePlusClient {

	/**
	 * 全格式
	 * @param fontFace 请求接口参数
	 * @author gaobing
	 * @return FontFaceResult
	 */
	public RamUnicodeItemResult getFontFace(RamUnicodeFontApiParam fontFace);
	


	/**
	 * Woff
	 * @param fontFace 请求接口参数
	 * @author gaobing
	 * @return FontFaceResult
	 */
    public RamUnicodeItemResult getWoffFontFace(RamUnicodeFontApiParam fontFace);
    
    
    
    /**
	 * 全格式 - 用户指定文本
	 * @param fontFace 请求接口参数
	 * @author gaobing
	 * @return FontFaceResult
	 */
	public RamUnicodeItemResult getScopeFontFace(RamUnicodeScopeFontApiParam fontFace);
	


	/**
	 * Woff - 用户指定文本
	 * @param fontFace 请求接口参数
	 * @author gaobing
	 * @return FontFaceResult
	 */
    public RamUnicodeItemResult getScopeWoffFontFace(RamUnicodeScopeFontApiParam fontFace);
    
    
    
}
