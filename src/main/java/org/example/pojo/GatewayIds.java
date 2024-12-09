package org.example.pojo;

import com.google.gson.annotations.SerializedName;

public class GatewayIds{

	@SerializedName("eui")
	private String eui;

	@SerializedName("gateway_id")
	private String gatewayId;

	public String getEui(){
		return eui;
	}

	public String getGatewayId(){
		return gatewayId;
	}
}