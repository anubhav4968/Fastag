package com.anubhav;

public class Cash {

	private String vehicleNumber;
	private String vehicleType;
	private String vehicleCategory;
	
	public String getVehicleCategory() {
		return vehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	@Override
	public String toString() {
		return "Cash [vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + ", vehicleCategory="
				+ vehicleCategory + "]";
	}

	
}
