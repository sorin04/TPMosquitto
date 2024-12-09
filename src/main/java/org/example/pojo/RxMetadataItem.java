package org.example.pojo;

import com.google.gson.annotations.SerializedName;

public class RxMetadataItem{

	@SerializedName("rssi")
	private int rssi;

	@SerializedName("uplink_token")
	private String uplinkToken;

	@SerializedName("snr")
	private Object snr;

	@SerializedName("received_at")
	private String receivedAt;

	@SerializedName("channel_rssi")
	private int channelRssi;

	@SerializedName("location")
	private Location location;

	@SerializedName("time")
	private String time;

	@SerializedName("gateway_ids")
	private GatewayIds gatewayIds;

	@SerializedName("timestamp")
	private long timestamp;

	public int getRssi(){
		return rssi;
	}

	public String getUplinkToken(){
		return uplinkToken;
	}

	public Object getSnr(){
		return snr;
	}

	public String getReceivedAt(){
		return receivedAt;
	}

	public int getChannelRssi(){
		return channelRssi;
	}

	public Location getLocation(){
		return location;
	}

	public String getTime(){
		return time;
	}

	public GatewayIds getGatewayIds(){
		return gatewayIds;
	}

	public long getTimestamp(){
		return timestamp;
	}
}