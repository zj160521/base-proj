package com.simes.core.exception;

/**
 * @Description:
 * @Author: zhouj
 * @Date: 2019/9/5 16:17
 */
public class SystemException extends RuntimeException {
    private String message;

    private int code;
    
	public SystemException() {
		super();
		this.code = 5000;
		this.message = "未知错误";
	}
	public SystemException(String exceptionInfo) {
		super(exceptionInfo);
		this.code = 5000;
		this.message = exceptionInfo;
	}

	public SystemException(Exception e) {
		super(e);
		this.code = 5000;
		this.message = "服务器错误";
	}
	public SystemException(String exceptionInfo,int code) {
		super(exceptionInfo);
		this.code=code;
		this.message=exceptionInfo;
	}
	public SystemException(Exception e,int code) {
		super(e);
		this.code = code;
		this.message = "服务器错误";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1739601632014644735L;

	@Override
	public String getMessage() {
		return message;
	}
	public int getCode() {
		return code;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setCode(int code) {
		this.code = code;
	}

}
