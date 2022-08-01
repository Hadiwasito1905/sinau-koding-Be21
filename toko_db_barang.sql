create table barang
(
    id          int auto_increment
        primary key,
    nama_barang varchar(100) null,
    harga       double       null,
    stok        int          null,
    id_supplier int          null,
    constraint barang_id_uindex
        unique (id),
    constraint id_supplier
        foreign key (id_supplier) references supplier (id)
);

