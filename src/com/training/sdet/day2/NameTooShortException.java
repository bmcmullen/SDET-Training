package com.training.sdet.day2;

public class NameTooShortException extends Exception{
	private String msg;
	
	public NameTooShortException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidNameException [msg=" + msg + "]";
	}

	public String getMsg() {
		return "#*#*# " + msg;
	}
	
}
