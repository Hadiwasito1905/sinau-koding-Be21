create table pembeli
(
    id           int auto_increment
        primary key,
    nama_pembeli varchar(255) null,
    no_tlp       varchar(20)  null,
    alamat       varchar(255) null,
    constraint pembeli_id_uindex
        unique (id)
);

