drop table tbl_board ;
create table tbl_board
 ( seq integer not null, user_name varchar(20) not null,
   content varchar(1000),regdate timestamp default systimestamp,
     modifydate timestamp);

insert into tbl_board (seq, user_name, content) values(1, '¼ºÀÏÂ¯', 'Ã¹»§');