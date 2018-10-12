package com.youziku_plus.sdk.param;
/*
* 单标签模式-处理全部内容 请求参数
* @author gaobing
*
*/
public class RamUnicodeFontApiParam {
	
	private String accessKey;
	
	private String content;
	
	private String tag;
	
	private boolean useRanFontFamily;
	
	private RamSortUnicodeApiOption option;
	
	public RamUnicodeFontApiParam(){}
	
	/**
	 * 单标签模式
	 * @param accessKey 系统规定参数，从有字库字体使用页中"卢教"模式中获取，$youziku.load 语句中第2个参数即为AccessKey。
	 * @param content 生成内容
	 * @param tag 标签名称
	 * @param option 配置项
	 */
	public RamUnicodeFontApiParam(String accessKey,String content,String tag,RamSortUnicodeApiOption option){
		this.accessKey = accessKey;
		this.content = content;
		this.tag = tag;
		this.option=option;
	}

	/**
	 * 单标签模式
	 * @param accessKey 系统规定参数，从有字库字体使用页中"卢教"模式中获取，$youziku.load 语句中第2个参数即为AccessKey。
	 * @param content 生成内容
	 * @param tag 标签名称
	 * @param useRanFontFamily 使用随机fontfamily
	 * @param option 配置项
	 */
	public RamUnicodeFontApiParam(String accessKey,String content,String tag,boolean useRanFontFamily,RamSortUnicodeApiOption option){
		this.accessKey = accessKey;
		this.content = content;
		this.tag = tag;
		this.useRanFontFamily= useRanFontFamily;
		this.option=option;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public boolean getUseRanFontFamily() {
		return useRanFontFamily;
	}

	public void setUseRanFontFamily(boolean useRanFontFamily) {
		this.useRanFontFamily = useRanFontFamily;
	}

	public RamSortUnicodeApiOption getOption() {
		return option;
	}

	public void setOption(RamSortUnicodeApiOption option) {
		this.option = option;
	}
	
	
	
	
}
