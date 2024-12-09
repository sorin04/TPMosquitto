package org.example.pojo;

import com.google.gson.annotations.SerializedName;

public class VersionIds{

	@SerializedName("band_id")
	private String bandId;

	@SerializedName("model_id")
	private String modelId;

	@SerializedName("firmware_version")
	private String firmwareVersion;

	@SerializedName("hardware_version")
	private String hardwareVersion;

	@SerializedName("brand_id")
	private String brandId;

	public String getBandId(){
		return bandId;
	}

	public String getModelId(){
		return modelId;
	}

	public String getFirmwareVersion(){
		return firmwareVersion;
	}

	public String getHardwareVersion(){
		return hardwareVersion;
	}

	public String getBrandId(){
		return brandId;
	}
}