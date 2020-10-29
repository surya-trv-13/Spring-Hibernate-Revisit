create table person 
(
	id integer not null,
	name varchar(255) not null,
	age integer,
	dob timestamp,
	primary key(id)
);

insert into person (id , name , age , dob) 
values(10001,'Surya',22,sysdate());
insert into person (id , name , age , dob) 
values(10002,'Saptarshi',21,sysdate());
insert into person (id , name , age , dob) 
values(10003,'Suman',20,sysdate());