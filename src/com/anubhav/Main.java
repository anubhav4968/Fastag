package com.anubhav;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static HashMap<Integer, Object> hashMap = new HashMap<>();
	static int vehicleCount= 0;
	static int count =0;
	static int amount=0;
	static Fastag fastag = new Fastag();
	static Cash cash = new Cash();
	static Scanner scan = new Scanner(System.in);
	
	public static void forFastag() {
		vehicleCount = vehicleCount+1;
		fastag.setFastag(true);
		
		System.out.println("Enter Vehicle Number:");
		String vehicleNumber = scan.next();
		fastag.setVehicleNumber(vehicleNumber);
		
		System.out.println("Enter Vehicle Type:");
		String vehicleType = scan.next();
		fastag.setVehicleType(vehicleType);
		
		System.out.println("Enter Vehicle Category:");
		String category = scan.next();
		fastag.setVehicleCategory(category);
		
		System.out.println("Enter Balance:");
		int balance = scan.nextInt();
		fastag.setBalance(balance);
		
		hashMap.put(vehicleCount, fastag);
		System.out.println("Added");
	}
	
	public static void forCAsh() {
		
		vehicleCount = vehicleCount+1;
		
		System.out.println("Enter Vehicle Number:");
		String vehicleNumber = scan.next();
		cash.setVehicleNumber(vehicleNumber);
		
		System.out.println("Enter Vehicle Type:");
		String vehicleType = scan.next();
		cash.setVehicleType(vehicleType);
		
		System.out.println("Enter Vehicle Category:");
		String category = scan.next();
		cash.setVehicleCategory(category);
		
		amount=amount+40;
		hashMap.put(vehicleCount, cash);
		System.out.println("Added");
	}
	
	 public static int getAmountBasedOnCategory(Object object) {
		 
		 String category = null;
		 if(object.equals(fastag)) {
			 category= fastag.getVehicleCategory();
			 
		 }
		 else {
			 category = cash.getVehicleCategory();
		 }
		 switch(category){
			case "Heavy":if(count!=2) {
									amount=amount+200;
								}
								else {
									amount=amount+100;
								}
			break;
			case "Light":if(count!=2) {
								amount=amount+100;
							}
							else {
								amount=amount+50;
							}
			break;
			case "Two":if(count!=2) {
								amount=amount+50;
							}
							else {
								amount=amount+25;
							}
			break;
			}
		 
		 
		 return amount;
	 }
	
	 public static int getAmountBasedOnFastag(int amount) {
		 
		 if(fastag.getBalance()>=amount) {
			 fastag.setBalance(fastag.getBalance()-amount);
		 return 0;
		 }
		 else {
			 amount=(amount-fastag.getBalance())+40;
			 fastag.setBalance(0);
//			 forCAsh();
			 return amount;
		 }
		 
		 
		 
	 }
	
	public static void main(String[] args) {
		
				
		System.out.println("Fastag available or not:");
		boolean isFastag= scan.nextBoolean();
		
		if(isFastag) {
			forFastag();
			if(count<2) {
				count=count+1;
				int cost = getAmountBasedOnCategory(fastag);
				int costByFastag = getAmountBasedOnFastag(cost);
				System.out.println("Amount Paid By Cash:"+costByFastag);
			}
			
			else
			{
				count=0;
			}
		
			System.out.println(hashMap);
			
		}
		else {
			forCAsh();
			if(count<2) {
				count=count+1;
				int cost = getAmountBasedOnCategory(cash);
				System.out.println("Amount Paid By Cash:"+cost);
				
			}
			
			else
			{
				count=0;
			}
			System.out.println("amount:"+amount);
			System.out.println(hashMap);
		}
		System.out.println("Are you want to fill more or what? or print details:");
		boolean ans = scan.nextBoolean();
		if(ans) {
			main(args);
		}
		else
		{
			System.out.println("Amount:" +amount);
		}
	}
}
