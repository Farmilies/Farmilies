package com.coin.vo;

public class ContractVO {
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
		comments                     		VARCHAR2(2000)		 NULL ,
		worker_id                     		VARCHAR2(50)		 NOT NULL,
		work_id                       		NUMBER(10)		 NOT NULL
);



);
	 */

	
	
	int id;
	
	
	public ContractVO() {
		super();
	}
	public ContractVO(int id, double rating, String comments, String worker_id, int work_id) {
		super();
		this.id = id;
		this.rating = rating;
		this.comments = comments;
		this.worker_id = worker_id;
		this.work_id = work_id;
	}
	double rating;
	String comments;
	String worker_id;
	int work_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(String worker_id) {
		this.worker_id = worker_id;
	}
	
	public int getWork_id() {
		return work_id;
	}
	public void setWork_id(int work_id) {
		this.work_id = work_id;
	}
	@Override
	public String toString() {
		return "ContractVO [id=" + id + ", rating=" + rating + ", comments=" + comments + ", worker_id=" + worker_id
				+ ", work_id=" + work_id + "]";
	}
	
		

}
