package org.example.pojo;

import com.google.gson.annotations.SerializedName;

public class ApplicationIds{

	@SerializedName("application_id")
	private String applicationId;

	public String getApplicationId(){
		return applicationId;
	}
}