-- run -> system // id : c##comidb // pwd : comidb
create user c##comidb IDENTIFIED by comidb;

grant connect, resource to c##comidb;
grant create view to c##comidb;
alter user c##comidb
quota 1024m on users;