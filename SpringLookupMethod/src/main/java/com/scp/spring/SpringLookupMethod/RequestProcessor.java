package com.scp.spring.SpringLookupMethod;

public class RequestProcessor {

	private RequestValidator validator;
	public void handelRequest(String requestId){
		validator.validate(requestId);
	}
	public RequestValidator getValidator() {
		return validator;
	}
	public void setValidator(RequestValidator validator) {
		this.validator = validator;
	}
}
