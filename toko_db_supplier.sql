create table supplier
(
    id            int auto_increment
        primary key,
    nama_supplier varchar(100) null,
    no_tlp        varchar(20)  null,
    alamat        varchar(255) null,
    constraint supplier_id_uindex
        unique (id)
);

