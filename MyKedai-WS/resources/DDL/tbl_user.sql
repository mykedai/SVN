drop table if exists tbl_user;
drop sequence if exists sec_id_user;
create sequence sec_id_user;
drop sequence if exists sec_publicId_user;
create sequence sec_publicId_user;
    
create table tbl_user (
	id int primary key not null default nextval('sec_id_user'),
	publicId int not null default nextval('sec_publicId_user'), 
	username varchar(9) not null,
	password varchar not null,
	email varchar(30),
	phone varchar(13),
	flagactive boolean default false,
	flaglocked boolean default true,
	statusId int not null,
	timestampstatus timestamp not null default current_timestamp,
	lastlogin date,
	token varchar,
	roleGroupId int,
	userType int,
	referenceId int,
	lastUpdatedBy int not null
);