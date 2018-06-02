/*
@D:\CodeRes\Eclipse_Oxygen\SpringApp\src\farmilies.sql
@D:\CodeRes\Eclipse_Oxygen\SpringApp\src\sample.sql
*/
DROP TABLE CONTRACTS CASCADE CONSTRAINTS;
DROP TABLE WORKS CASCADE CONSTRAINTS;
DROP TABLE LOCATIONS CASCADE CONSTRAINTS;
DROP TABLE USERS CASCADE CONSTRAINTS;
DROP TABLE PICTURES CASCADE CONSTRAINTS;
DROP TABLE USERGROUPS CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: USERGROUPS */
/**********************************/
CREATE TABLE USERGROUPS(
		id                            		NUMBER(3)		 NOT NULL,
		name                          		VARCHAR2(50)		 NOT NULL,
		update_at                     		DATE		 DEFAULT sysdate		 NOT NULL,
		create_at                     		DATE		 DEFAULT sysdate		 NOT NULL
);

COMMENT ON TABLE USERGROUPS is 'USERGROUPS';
COMMENT ON COLUMN USERGROUPS.id is 'id';
COMMENT ON COLUMN USERGROUPS.name is 'name';
COMMENT ON COLUMN USERGROUPS.update_at is 'update_at';
COMMENT ON COLUMN USERGROUPS.create_at is 'create_at';


/**********************************/
/* Table Name: PICTURES */
/**********************************/
CREATE TABLE PICTURES(
		id                            		NUMBER(12)		 NOT NULL,
		picname                       		VARCHAR2(50)		 NULL ,
		pic_loc                       		VARCHAR2(500)		 NULL 
);

COMMENT ON TABLE PICTURES is 'PICTURES';
COMMENT ON COLUMN PICTURES.id is 'id';
COMMENT ON COLUMN PICTURES.picname is 'picname';
COMMENT ON COLUMN PICTURES.pic_loc is 'pic_loc';


/**********************************/
/* Table Name: USERS */
/**********************************/
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

COMMENT ON TABLE USERS is 'USERS';
COMMENT ON COLUMN USERS.id is 'id';
COMMENT ON COLUMN USERS.update_at is 'update_at';
COMMENT ON COLUMN USERS.create_at is 'create_at';
COMMENT ON COLUMN USERS.email is 'email';
COMMENT ON COLUMN USERS.password is 'password';
COMMENT ON COLUMN USERS.first_name is 'first_name';
COMMENT ON COLUMN USERS.last_name is 'last_name';
COMMENT ON COLUMN USERS.group_id is 'group_id';
COMMENT ON COLUMN USERS.picture_id is 'picture_id';


/**********************************/
/* Table Name: LOCATIONS */
/**********************************/
CREATE TABLE LOCATIONS(
		id                            		NUMBER(10)		 NOT NULL,
		address_name                  		VARCHAR2(500)		 NOT NULL,
		address_type                  		VARCHAR2(11)		 NOT NULL,
		x                             		DOUBLE PRECISION		 NOT NULL,
		y                             		DOUBLE PRECISION		 NOT NULL,
		region_address                		VARCHAR2(500)		 NOT NULL,
		road_address                  		VARCHAR2(500)		 NULL 
);

COMMENT ON TABLE LOCATIONS is 'LOCATIONS';
COMMENT ON COLUMN LOCATIONS.id is 'id';
COMMENT ON COLUMN LOCATIONS.address_name is 'address_name';
COMMENT ON COLUMN LOCATIONS.address_type is 'address_type';
COMMENT ON COLUMN LOCATIONS.x is 'x';
COMMENT ON COLUMN LOCATIONS.y is 'y';
COMMENT ON COLUMN LOCATIONS.region_address is 'region_address';
COMMENT ON COLUMN LOCATIONS.road_address is 'road_address';


/**********************************/
/* Table Name: WORKS */
/**********************************/
CREATE TABLE WORKS(
		id                            		NUMBER(10)		 NOT NULL,
		pic_id                        		NUMBER(12)		 NULL ,
		hirer_id                      		VARCHAR2(50)		 NOT NULL,
		title                         		VARCHAR2(50)		 NOT NULL,
		description                   		VARCHAR2(500)		 NOT NULL,
		location_id                   		NUMBER(10)		 NULL 
);

COMMENT ON TABLE WORKS is 'WORKS';
COMMENT ON COLUMN WORKS.id is 'id';
COMMENT ON COLUMN WORKS.pic_id is 'pic_id';
COMMENT ON COLUMN WORKS.hirer_id is 'hirer_id';
COMMENT ON COLUMN WORKS.title is 'title';
COMMENT ON COLUMN WORKS.description is 'description';
COMMENT ON COLUMN WORKS.location_id is 'location_id';




/**********************************/
/* Table Name: CONTRACTS */
/**********************************/
CREATE TABLE CONTRACTS(
		id                            		NUMBER(10)		 NOT NULL,
		rating                        		NUMBER(10,2)		 NULL ,
		comments                      		VARCHAR2(2000)		 NULL ,
		worker_id                     		VARCHAR2(50)		 NOT NULL,
		work_id                       		NUMBER(10)		 NOT NULL
);

COMMENT ON TABLE CONTRACTS is 'CONTRACTS';
COMMENT ON COLUMN CONTRACTS.id is 'id';
COMMENT ON COLUMN CONTRACTS.rating is 'rating';
COMMENT ON COLUMN CONTRACTS.comments is 'comments';
COMMENT ON COLUMN CONTRACTS.worker_id is 'worker_id';
COMMENT ON COLUMN CONTRACTS.work_id is 'work_id';


ALTER TABLE USERGROUPS ADD CONSTRAINT IDX_USERGROUPS_PK PRIMARY KEY (id);

ALTER TABLE PICTURES ADD CONSTRAINT IDX_PICTURES_PK PRIMARY KEY (id);

ALTER TABLE USERS ADD CONSTRAINT IDX_USERS_PK PRIMARY KEY (id);
ALTER TABLE USERS ADD CONSTRAINT IDX_USERS_FK0 FOREIGN KEY (group_id) REFERENCES USERGROUPS (id);
ALTER TABLE USERS ADD CONSTRAINT IDX_USERS_FK1 FOREIGN KEY (picture_id) REFERENCES PICTURES (id);

ALTER TABLE LOCATIONS ADD CONSTRAINT IDX_LOCATIONS_PK PRIMARY KEY (id);

ALTER TABLE WORKS ADD CONSTRAINT IDX_WORKS_PK PRIMARY KEY (id);
ALTER TABLE WORKS ADD CONSTRAINT IDX_WORKS_FK0 FOREIGN KEY (hirer_id) REFERENCES USERS (id);
ALTER TABLE WORKS ADD CONSTRAINT IDX_WORKS_FK1 FOREIGN KEY (pic_id) REFERENCES PICTURES (id);
ALTER TABLE WORKS ADD CONSTRAINT IDX_WORKS_FK2 FOREIGN KEY (location_id) REFERENCES LOCATIONS (id);

ALTER TABLE CONTRACTS ADD CONSTRAINT IDX_CONTRACTS_PK PRIMARY KEY (id);
ALTER TABLE CONTRACTS ADD CONSTRAINT IDX_CONTRACTS_FK0 FOREIGN KEY (work_id) REFERENCES WORKS (id);
ALTER TABLE CONTRACTS ADD CONSTRAINT IDX_CONTRACTS_FK1 FOREIGN KEY (worker_id) REFERENCES USERS (id);

select works.id,works.pic_id,works.hirer_id,works.title,works.description,works.location_id
from works,locations 
where (works.location_id = locations.id) 
and ((locations.x-130.37)*(locations.x-130.37)+(locations.y-35.35)*(locations.y-35.35))< 1000
