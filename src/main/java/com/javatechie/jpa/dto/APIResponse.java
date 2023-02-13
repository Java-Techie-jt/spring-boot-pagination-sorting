package com.javatechie.jpa.dto;



public class APIResponse<T> {

    int recordCount;
    T response;
	public APIResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public T getResponse() {
		return response;
	}
	public APIResponse(int recordCount, T response) {
		super();
		this.recordCount = recordCount;
		this.response = response;
	}
	public void setResponse(T response) {
		this.response = response;
	}

}
