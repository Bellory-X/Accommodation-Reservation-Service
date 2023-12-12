create table announcement
(
    id bigserial primary key,
    title varchar(100) not null,
    address varchar(100) not null,
    price int not null,
    number_of_beds int not null,
    description text not null default ''
);