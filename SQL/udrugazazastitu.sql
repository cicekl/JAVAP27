drop database if exists udrugazazastituzivotinja;
create database udrugazazastituzivotinja;
use udrugazazastituzivotinja;

create table osoba(
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    sifra int not null primary key auto_increment
);

create table prostor(
    sifra int not null primary key auto_increment,
    zivotinja varchar(50) not null,
    dimenzije varchar(50) null,
    rednibroj int not null,
    sticenik int not null
);

create table sticenik(
    pasmina varchar(50) not null,
    ime varchar(50) not null,
    sifra int not null primary key auto_increment,
    velicina int null,
    osoba int not null
);

alter table sticenik add foreign key(osoba) references osoba(sifra);
alter table prostor add foreign key(sticenik) references sticenik(sifra);

