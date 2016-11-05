DROP  VIEW IF EXISTS vw_user;
CREATE VIEW vw_user AS 
SELECT usr.* FROM tbl_user usr
INNER JOIN (
    SELECT 
max(id) as id, 
publicId
 from  tbl_user GROUP BY publicId) usrTemp on usr.id= usrTemp.id 
WHERE usr.statusid <> 2;