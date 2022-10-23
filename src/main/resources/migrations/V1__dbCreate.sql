create table user (
	id int auto_increment primary key,
	uname varchar(256),
	username varchar(256),
	role_id int
);

create table login (
	id int primary key,
	login varchar(256),
	password varchar(256),
	user_id int
);

create table role (
	id int auto_increment primary key
);

create table ticket (
    id int auto_increment primary key,
	route_id int primary key,
    user_id int,
    passport varchar(256)
);

create table aircompany (
	aircompany_id int auto_increment primary key
    );

create table route (
	id int auto_increment primary key,
    departure int,
    arrival int
);

create table city (
	id int auto_increment primary key,
    country_id int
);

create table country (
	id int auto_increment primary key
);