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
		pic_loc                       		VARCHAR2(500)		 NOT NULL
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
		address_name                  		VARCHAR2(500)		 NULL ,
		address_type                  		VARCHAR2(11)		 NULL ,
		x                             		DOUBLE PRECISION		 NOT NULL,
		y                             		DOUBLE PRECISION		 NOT NULL,
		region_address                		VARCHAR2(500)		 NULL ,
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
		stage                         		NUMBER(3)		 NULL ,
		rating                        		NUMBER(10,2)		 NULL ,
		comments                      		VARCHAR2(2000)		 NULL ,
		worker_id                     		VARCHAR2(50)		 NOT NULL,
		work_id                       		NUMBER(10)		 NOT NULL
);

COMMENT ON TABLE CONTRACTS is 'CONTRACTS';
COMMENT ON COLUMN CONTRACTS.id is 'id';
COMMENT ON COLUMN CONTRACTS.stage is 'stage';
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


insert into usergroups (id,name,update_at,create_at) values (101,'admins',
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss')); 

insert into usergroups (id,name,update_at,create_at) values (102,'farmers',
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss')); 

insert into usergroups (id,name,update_at,create_at) values (103,'workers',
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));  

insert into usergroups (id,name,update_at,create_at) values (104,'farmerworkers',
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));  



insert into pictures(id,picname,pic_loc) values (001,'awbwab','aa/bb/cc'); 
insert into pictures(id,picname,pic_loc) values (002,'ddawab','aa/bb/cc'); 
insert into pictures(id,picname,pic_loc) values (003,'eeawbab','aa/bb/cc'); 
insert into pictures(id,picname,pic_loc) values (004,'rgfawwab','aa/bb/cc'); 


insert into USERS (ID,EMAIL,PASSWORD,FIRST_NAME,LAST_NAME,GROUP_ID,PICTURE_ID) values ('laggu','kwla103@naver.com','laggu','구원','라',101,001);
insert into USERS (ID,EMAIL,PASSWORD,FIRST_NAME,LAST_NAME,GROUP_ID,PICTURE_ID) values ('lsupertopl','lsupertopl@naver.com','lsupertopl','병준','김',102,002);
insert into USERS (ID,EMAIL,PASSWORD,FIRST_NAME,LAST_NAME,GROUP_ID,PICTURE_ID) values ('fkalar747','fkalar747@naver.com','fkalar747','남호','이',103,003);
insert into USERS (ID,EMAIL,PASSWORD,FIRST_NAME,LAST_NAME,GROUP_ID,PICTURE_ID) values ('윤기석','윤기석@naver.com','윤기석','기석','윤',104,004);
insert into USERS (ID,EMAIL,PASSWORD,FIRST_NAME,LAST_NAME,GROUP_ID,PICTURE_ID) values ('한나영','한나영@naver.com','한나영','나영','한',103,001);


insert into locations(id,address_name,address_type,x,y,region_address,road_address) values (1001,'laggus address','road',35.5,45.5,'a region_address sample','a road_address sample');
insert into locations(id,address_name,address_type,x,y,region_address,road_address) values (1002,'gaweg address','road',38.5,49.5,'a region_address sample','a road_address sample');
insert into locations(id,address_name,address_type,x,y,region_address,road_address) values (1003,'weag address','road',125.5,67.5,'a region_address sample','a road_address sample');
insert into locations(id,address_name,address_type,x,y,region_address,road_address) values (1004,'gega address','road',135.5,21.5,'a region_address sample','a road_address sample');

insert into works(id,pic_id,hirer_id,title,description,location_id) values (1001,001,'laggu','a_title','a_description_blahblahblah',1001);
insert into works(id,pic_id,hirer_id,title,description,location_id) values (1002,001,'laggu','b_title','a_description_blahblahbaweaawlaawhhh',1002);
insert into works(id,pic_id,hirer_id,title,description,location_id) values (1003,001,'laggu','c_title','a_description_blgweagawaahblahblah',1003);


insert into contracts(id,rating,comments,worker_id,work_id) values (1001,37.1453,'hello world','fkalar747',1001);
insert into contracts(id,rating,comments,worker_id,work_id) values (1002,217.1434253,'hello world','laggu',1001);
insert into contracts(id,rating,comments,worker_id,work_id) values (1003,4547.145523,'hello world','fkalar747',1001);
insert into contracts(id,rating,comments,worker_id,work_id) values (1004,617.14513,'hello world','fkalar747',1001);


