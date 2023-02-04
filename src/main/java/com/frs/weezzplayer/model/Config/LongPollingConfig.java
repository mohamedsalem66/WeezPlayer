package com.frs.weezzplayer.model.Config;

import lombok.Data;

@Data
public class LongPollingConfig {
    private Long timeOut = 3600000L;
    private String response = "Time Out";
	public Long getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(Long timeOut) {
		this.timeOut = timeOut;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
}
