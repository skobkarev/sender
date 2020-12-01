-- создаем таблицу с отправляемыми объектами




create table if not exists numbers

(

    id bigint not null primary key ,
    msisdn bigint not null,
    action varchar(200) not null,
    timestamp bigint not null


);

CREATE SEQUENCE if not exists numbers_id_seq START WITH 1 INCREMENT BY 1

