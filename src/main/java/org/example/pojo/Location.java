package org.example.pojo;

import com.google.gson.annotations.SerializedName;

public class Location{

	@SerializedName("altitude")
	private int altitude;

	@SerializedName("latitude")
	private Object latitude;

	@SerializedName("source")
	private String source;

	@SerializedName("longitude")
	private Object longitude;

	public int getAltitude(){
		return altitude;
	}

	public Object getLatitude(){
		return latitude;
	}

	public String getSource(){
		return source;
	}

	public Object getLongitude(){
		return longitude;
	}
}