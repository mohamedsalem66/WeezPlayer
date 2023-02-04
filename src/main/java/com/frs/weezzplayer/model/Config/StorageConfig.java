package com.frs.weezzplayer.model.Config;

import java.net.URI;

import lombok.Data;

@Data
public class StorageConfig {
    private String directory = "C:/laragon/www/weezzplayerUpload/";
    private String url = "http://192.168.1.12/weezzplayerUpload/";
	public String getDirectory() {
		
		return directory;
	}
	public String getUrl() {
		
		return url;
	}
}
