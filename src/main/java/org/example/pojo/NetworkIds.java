package org.example.pojo;

import com.google.gson.annotations.SerializedName;

public class NetworkIds{

	@SerializedName("tenant_id")
	private String tenantId;

	@SerializedName("cluster_id")
	private String clusterId;

	@SerializedName("ns_id")
	private String nsId;

	@SerializedName("net_id")
	private String netId;

	@SerializedName("cluster_address")
	private String clusterAddress;

	public String getTenantId(){
		return tenantId;
	}

	public String getClusterId(){
		return clusterId;
	}

	public String getNsId(){
		return nsId;
	}

	public String getNetId(){
		return netId;
	}

	public String getClusterAddress(){
		return clusterAddress;
	}
}