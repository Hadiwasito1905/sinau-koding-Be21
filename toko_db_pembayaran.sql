create table pembayaran
(
    id           int auto_increment
        primary key,
    tgl_bayar    datetime null,
    total        double   null,
    id_transaksi int      null,
    constraint pembayaran_id_uindex
        unique (id),
    constraint id_transaksi
        foreign key (id_transaksi) references transaksi (id)
);

