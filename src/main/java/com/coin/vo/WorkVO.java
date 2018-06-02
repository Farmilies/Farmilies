package com.coin.vo;

public class WorkVO {
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
	
	int id;
	int pic_id;
	String hirer_id;
	String title;
	String description;
	int location_id;
	public String getHirer_id() {
		return hirer_id;
	}
	public void setHirer_id(String hirer_id) {
		this.hirer_id = hirer_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPic_id() {
		return pic_id;
	}
	public void setPic_id(int pic_id) {
		this.pic_id = pic_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	@Override
	public String toString() {
		return "WorkVO [id=" + id + ", pic_id=" + pic_id + ", hirer_id=" + hirer_id + ", title=" + title
				+ ", description=" + description + ", location_id=" + location_id + "]";
	}
	
	
	
	
}
