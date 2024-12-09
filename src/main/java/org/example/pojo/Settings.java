package org.example.pojo;

import com.google.gson.annotations.SerializedName;

public class Settings{

	@SerializedName("data_rate")
	private DataRate dataRate;

	@SerializedName("time")
	private String time;

	@SerializedName("frequency")
	private String frequency;

	@SerializedName("timestamp")
	private long timestamp;

	public DataRate getDataRate(){
		return dataRate;
	}

	public String getTime(){
		return time;
	}

	public String getFrequency(){
		return frequency;
	}

	public long getTimestamp(){
		return timestamp;
	}
}