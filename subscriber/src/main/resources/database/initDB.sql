-- создаем таблицу для принимаемых объектов



create table if not exists purchase

(

    id bigint not null primary key,
    incomingid bigint not null,
    msisdn bigint not null,
    timestamp bigint not null


);

CREATE SEQUENCE if not exists purchase_id_seq START WITH 1 INCREMENT BY 1;




create table if not exists subscription

(

    id bigint not null primary key,
    incomingid bigint not null,
    msisdn bigint not null,
    timestamp bigint not null


);

CREATE SEQUENCE if not exists subscription_id_seq START WITH 1 INCREMENT BY 1

