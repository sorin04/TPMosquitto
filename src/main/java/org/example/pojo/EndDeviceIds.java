package org.example.pojo;

import com.google.gson.annotations.SerializedName;

public class EndDeviceIds{

	@SerializedName("join_eui")
	private String joinEui;

	@SerializedName("device_id")
	private String deviceId;

	@SerializedName("application_ids")
	private ApplicationIds applicationIds;

	@SerializedName("dev_addr")
	private String devAddr;

	@SerializedName("dev_eui")
	private String devEui;

	public String getJoinEui(){
		return joinEui;
	}

	public String getDeviceId(){
		return deviceId;
	}

	public ApplicationIds getApplicationIds(){
		return applicationIds;
	}

	public String getDevAddr(){
		return devAddr;
	}

	public String getDevEui(){
		return devEui;
	}
}