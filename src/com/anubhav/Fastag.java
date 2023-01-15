package com.anubhav;

public class Fastag {

	private String vehicleNumber;
	private String vehicleType;
	private String vehicleCategory;
	private boolean fastag;
	private int balance;
	
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
	public boolean isFastag() {
		return fastag;
	}
	public void setFastag(boolean fastag) {
		this.fastag = fastag;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getVehicleCategory() {
		return vehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	@Override
	public String toString() {
		return "Fastag [vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + ", vehicleCategory="
				+ vehicleCategory + ", fastag=" + fastag + ", balance=" + balance + "]";
	}
	
}
