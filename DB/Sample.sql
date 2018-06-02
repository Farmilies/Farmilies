
insert into user_groups (id,name,update_at,create_at) values (101,'admins',
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss')); 

insert into user_groups (id,name,update_at,create_at) values (102,'farmers',
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss')); 

insert into user_groups (id,name,update_at,create_at) values (103,'workers',
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));  

insert into user_groups (id,name,update_at,create_at) values (104,'farmerworkers',
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'),
TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));  



insert into pictures(id,picname,pic_loc) values (001,'awbwab','aa/bb/cc'); 
insert into pictures(id,picname,pic_loc) values (002,'ddawab','aa/bb/cc'); 
insert into pictures(id,picname,pic_loc) values (003,'eeawbab','aa/bb/cc'); 
insert into pictures(id,picname,pic_loc) values (004,'rgfawwab','aa/bb/cc'); 


insert into USERS (ID,EMAIL,PASSWORD,FIRST_NAME,LAST_NAME,GROUP_ID,PICTURE_ID)
values ('laggu','kwla103@naver.com','laggu','구원','라',101,001);
insert into USERS (ID,EMAIL,PASSWORD,FIRST_NAME,LAST_NAME,GROUP_ID,PICTURE_ID)
values ('lsupertopl','lsupertopl@naver.com','lsupertopl','병준','김',102,002);
insert into USERS (ID,EMAIL,PASSWORD,FIRST_NAME,LAST_NAME,GROUP_ID,PICTURE_ID)
values ('fkalar747','fkalar747@naver.com','fkalar747','남호','이',103,003);
insert into USERS (ID,EMAIL,PASSWORD,FIRST_NAME,LAST_NAME,GROUP_ID,PICTURE_ID)
values ('윤기석','윤기석@naver.com','윤기석','기석','윤',104,004);
insert into USERS (ID,EMAIL,PASSWORD,FIRST_NAME,LAST_NAME,GROUP_ID,PICTURE_ID)
values ('한나영','한나영@naver.com','한나영','나영','한',105,001);