package com.youziku_plus.sdk.param;

/*
 * 单标签模式-处理指定内容 请求参数
 * @author gaobing
 *
 */
public class RamUnicodeScopeFontApiParam extends RamUnicodeFontApiParam {

	private String text;

	/**
	 * 单标签模式
	 * 
	 * @param accessKey
	 *            系统规定参数，从有字库字体使用页中"卢教"模式中获取，$youziku.load 语句中第2个参数即为AccessKey。
	 * @param content
	 *            生成内容
	 * @param tag
	 *            标签名称
	 * @param option
	 *            配置项
	 * @param text 指定处理的文本
	 */
	public RamUnicodeScopeFontApiParam(String accessKey, String content,
			String tag, RamSortUnicodeApiOption option,String text) {
		super(accessKey, content, tag, option);
		this.text=text;
	}

	/**
	 * 单标签模式
	 * 
	 * @param accessKey
	 *            系统规定参数，从有字库字体使用页中"卢教"模式中获取，$youziku.load 语句中第2个参数即为AccessKey。
	 * @param content
	 *            生成内容
	 * @param tag
	 *            标签名称
	 * @param useRanFontFamily
	 *            使用随机fontfamily
	 * @param option
	 *            配置项
	 * @param text 指定处理的文本
	 */
	public RamUnicodeScopeFontApiParam(String accessKey, String content,
			String tag, boolean useRanFontFamily, RamSortUnicodeApiOption option,String text) {
		super(accessKey, content, tag, useRanFontFamily, option);
		this.text=text;
	}

	public RamUnicodeScopeFontApiParam() {
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
