package org.example.pojo;

import com.google.gson.annotations.SerializedName;

public class Lora{

	@SerializedName("bandwidth")
	private int bandwidth;

	@SerializedName("coding_rate")
	private String codingRate;

	@SerializedName("spreading_factor")
	private int spreadingFactor;

	public int getBandwidth(){
		return bandwidth;
	}

	public String getCodingRate(){
		return codingRate;
	}

	public int getSpreadingFactor(){
		return spreadingFactor;
	}
}