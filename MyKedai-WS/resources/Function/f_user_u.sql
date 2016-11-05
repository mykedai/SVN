CREATE OR REPLACE FUNCTION f_user_u(
p_publicid int,
p_username varchar, 
p_password varchar, 
p_email varchar,
p_phone varchar,
p_flagactive boolean,
p_flaglocked boolean,
p_usertype int,
p_referenceid int,
p_roleGroupid int,
p_userid int)

RETURNS void AS 
$$

BEGIN

INSERT INTO tbl_user (
publicid,
username, 
password,
email,
phone,
flagactive,
flaglocked,
statusId,
userType,
referenceId,
roleGroupid,
lastupdatedby) 
VALUES (
p_publicid,
p_username, 
p_password,
p_email,
p_phone,
p_flagactive,
p_flaglocked,
3,--status update
p_usertype,
p_referenceid,
p_roleGroupid,
p_userid);

END;
$$
LANGUAGE PLPGSQL;