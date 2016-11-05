drop table if exists tbl_status;

create table tbl_status (
id int primary key not null,
status varchar,
tableName varchar,
description varchar,
flagActive boolean not null default true
);