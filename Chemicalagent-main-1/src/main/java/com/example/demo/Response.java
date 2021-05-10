package com.example.demo;

public class Response {
	
	private int status;
	private String message;
	private String data;
	private int datai;
	public int getDatai() {
		return datai;
	}
	public void setDatai(int datai) {
		this.datai = datai;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
