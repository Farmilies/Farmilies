package com.coin.vo;

import java.sql.Date;

public class UserVO {
	/*

CREATE TABLE USER_GROUPS(
		id                            		NUMBER(3)		 NOT NULL,
		name                          		VARCHAR2(50)		 NOT NULL,
		update_at                     		DATE		 DEFAULT sysdate		 NOT NULL,
		create_at                     		DATE		 DEFAULT sysdate		 NOT NULL
);

CREATE TABLE USERS(
		id                            		VARCHAR2(50)		 NOT NULL,
		update_at                     		DATE		 DEFAULT sysdate		 NOT NULL,
		create_at                     		DATE		 DEFAULT sysdate		 NOT NULL,
		email                         		VARCHAR2(50)		 NULL ,
		password                      		VARCHAR2(50)		 NOT NULL,
		first_name                    		VARCHAR2(50)		 NOT NULL,
		last_name                     		VARCHAR2(50)		 NOT NULL,
		group_id                      		NUMBER(3)		 NOT NULL,
		picture_id                    		NUMBER(12)		 NULL 
);

CREATE TABLE WORK(
		id                            		NUMBER(10)		 NOT NULL,
		pic_id                        		NUMBER(12)		 NULL ,
		hirer_id                      		VARCHAR2(50)		 NOT NULL,
		title                         		VARCHAR2(50)		 NOT NULL,
		description                   		VARCHAR2(500)		 NOT NULL,
		location_id                   		NUMBER(10)		 NULL 
);


CREATE TABLE CONTRACT(
		id                            		NUMBER(10)		 NOT NULL,
		rating                        		NUMBER(10,2)		 NULL ,
		comment                       		VARCHAR2(2000)		 NULL ,
		worker_id                     		VARCHAR2(50)		 NOT NULL,
		work_id                       		NUMBER(10)		 NOT NULL
);


	 */
	
	
	String id;
	Date update_at;
	Date create_at;
	String email;
	String password;
	String first_name;
	String last_name;
	int group_id;
	int picture_id;
	
	
	
	
	public UserVO(String id, Date update_at, Date create_at, String email, String password, String first_name,
			String last_name, int group_id, int picture_id) {
		super();
		this.id = id;
		this.update_at = update_at;
		this.create_at = create_at;
		this.email = email;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.group_id = group_id;
		this.picture_id = picture_id;
		 
	}
	
	
	public UserVO() {
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public int getPicture_id() {
		return picture_id;
	}
	public void setPicture_id(int picture_id) {
		this.picture_id = picture_id;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", update_at=" + update_at + ", create_at=" + create_at + ", email=" + email
				+ ", password=" + password + ", first_name=" + first_name + ", last_name=" + last_name + ", group_id="
				+ group_id + ", picture_id=" + picture_id + "]";
	}
	
	
	
}
