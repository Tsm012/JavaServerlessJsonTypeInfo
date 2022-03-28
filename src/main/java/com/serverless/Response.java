package com.serverless;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;


public class Response {
    
	private final String message;

	public Response(String message) {
		this.message = message;
	}

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "type")
	public String getMessage() {
		return this.message;
	}
}
