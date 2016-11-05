CREATE OR REPLACE FUNCTION f_user_d(
p_publicid int,
p_userid int)

RETURNS void AS 
$$

BEGIN
	
INSERT INTO tbl_user (
publicId,
username, 
password,
email,
phone,
flagactive,
flaglocked,
statusId,
userType,
referenceId,
lastupdatedby) 
SELECT
publicId,
username, 
password,
email,
phone,
false,
true,
2,--status delete
userType,
referenceId,
p_userid
FROM vw_user
WHERE publicId=p_publicId;

END;
$$
LANGUAGE PLPGSQL;