package com.coin.vo;

public class LocationVO {
	/*
	 * 		id                            		NUMBER(10)		 NOT NULL,

			address_name                  		VARCHAR2(500)		 NOT NULL,

			address_type                  		VARCHAR2(11)		 NOT NULL,

			x                             		DOUBLE PRECISION		 NOT NULL,

			y                             		DOUBLE PRECISION		 NOT NULL,

			region_address                		VARCHAR2(500)		 NOT NULL,

			road_address                  		VARCHAR2(500)		 NULL 
	 */
		
	int id;
	String address_name;
	String address_type;
	double x;
	double y;
	String region_address;
	String road_address;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress_name() {
		return address_name;
	}
	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}
	public String getAddress_type() {
		return address_type;
	}
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x; 
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getRegion_address() {
		return region_address;
	}
	public void setRegion_address(String region_address) {
		this.region_address = region_address;
	}
	public String getRoad_address() {
		return road_address;
	}
	public void setRoad_address(String road_address) {
		this.road_address = road_address;
	}
	@Override
	public String toString() {
		return "LocationVO [id=" + id + ", address_name=" + address_name + ", address_type=" + address_type + ", x=" + x
				+ ", y=" + y + ", region_address=" + region_address + ", road_address=" + road_address + "]";
	}
		
		
		
}
