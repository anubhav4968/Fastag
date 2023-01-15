package com.anubhav;

import java.util.Objects;

public class Fastag {

	
	private String vehicleNumber;
	private String vehicleType;
	private String vehicleCategory;
	private boolean fastag;
	private int balance;
	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
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
	@Override
	public int hashCode() {
		return Objects.hash(fastag, vehicleCategory, vehicleNumber, vehicleType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fastag other = (Fastag) obj;
		return fastag == other.fastag && Objects.equals(vehicleCategory, other.vehicleCategory)
				&& Objects.equals(vehicleNumber, other.vehicleNumber) && Objects.equals(vehicleType, other.vehicleType);
	}
	
	
}
