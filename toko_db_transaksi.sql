create table transaksi
(
    id             int auto_increment
        primary key,
    tgl_tranksaksi datetime     null,
    keterangan     varchar(255) null,
    id_barang      int          null,
    id_pembeli     int          null,
    constraint transaksi_id_uindex
        unique (id),
    constraint id_barang
        foreign key (id_barang) references barang (id),
    constraint id_pembeli
        foreign key (id_pembeli) references pembeli (id)
);

