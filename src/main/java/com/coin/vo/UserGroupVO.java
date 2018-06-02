package com.coin.vo;

import java.sql.Date;

public class UserGroupVO {
	/*
	 * 
CREATE TABLE USER_GROUPS(

		id                            		NUMBER(3)		 NOT NULL,

		name                          		VARCHAR2(50)		 NOT NULL,

		update_at                     		DATE		 DEFAULT sysdate		 NOT NULL,

		create_at                     		DATE		 DEFAULT sysdate		 NOT NULL,

		location_id                   		NUMBER(10)		 NOT NULL

);
	 */
	
	int id;
	String name;
	Date update_at;
	Date create_at;
	int location_id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdate_at() {
		return update_at; 
	}
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	@Override
	public String toString() {
		return "UserGroupVO [id=" + id + ", name=" + name + ", update_at=" + update_at + ", create_at=" + create_at
				+ ", location_id=" + location_id + "]";
	}
	
	
	
}
