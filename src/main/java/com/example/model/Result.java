package com.example.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Result {

	private String result;

	/**
	* No args constructor for use in serialization
	*
	*/
	public Result() {
	}

	/**
	*
	* @param result
	*/
	public Result(String result) {
	super();
	this.result = result;
	}

	public String getResult() {
	return result;
	}

	public void setResult(String result) {
	this.result = result;
	}

	@Override
	public String toString() {
	return new ToStringBuilder(this).append("result", result).toString();
	}
}
