package com.sprinjobportal.model;

public class ErrorDO{
	
	private String errorCode;
	
	private String errorDescription;
	
	private String uiErrorMessage;

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorDescription
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * @param errorDescription the errorDescription to set
	 */
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	/**
	 * @return the uiErrorMessage
	 */
	public String getUiErrorMessage() {
		return uiErrorMessage;
	}

	/**
	 * @param uiErrorMessage the uiErrorMessage to set
	 */
	public void setUiErrorMessage(String uiErrorMessage) {
		this.uiErrorMessage = uiErrorMessage;
	}

}
