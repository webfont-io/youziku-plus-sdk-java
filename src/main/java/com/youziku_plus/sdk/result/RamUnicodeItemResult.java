package com.youziku_plus.sdk.result;
/**
 * RamUnicodeItemResult
 * @author bing-pc
 *
 */
public class RamUnicodeItemResult  extends ResponseItemResult{
	/**
	 * 状态码
	 */
	private String Code;
	
	/**
	 * 错误消息
	 */
	private String ErrorMessage;

	
	private String NewContent;
	
	public String getCode() {
		return Code;
	}

	public void setCode(String Code) {
		this.Code = Code;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String ErrorMessage) {
		this.ErrorMessage = ErrorMessage;
	}

	public String getNewContent() {
		return NewContent;
	}

	public void setNewContent(String newContent) {
		NewContent = newContent;
	}
}
