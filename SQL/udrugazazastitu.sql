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

insert into osoba(ime,prezime,sifra) values('Marica','Maric',null);
insert into osoba(ime,prezime,sifra) values('Fran','Franic',null);

insert into prostor(sifra,zivotinja,rednibroj,sticenik) values(null,'pas',23,3);
insert into prostor(sifra,zivotinja,rednibroj,sticenik) values(null,'macka',14,2);

insert into sticenik(pasmina,ime,sifra,osoba) values('labrador','Blacky',null,1);
insert into sticenik(pasmina,ime,sifra,osoba) values('sijamska macka','Yuno',null,2);