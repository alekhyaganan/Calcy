package com.example.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class InputValues {

	private String x;
	private String y;

	public InputValues() {
	}

	/**
	*
	* @param x
	* @param y
	*/
	public InputValues(String x, String y) {
	super();
	this.x = x;
	this.y = y;
	}

	public String getX() {
	return x;
	}

	public void setX(String x) {
	this.x = x;
	}

	public String getY() {
	return y;
	}

	public void setY(String y) {
	this.y = y;
	}

	@Override
	public String toString() {
	return new ToStringBuilder(this).append("x", x).append("y", y).toString();
	}


}
