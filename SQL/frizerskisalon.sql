drop database if exists frizerskisalon;
create database frizerskisalon;
use frizerskisalon;

create table posjeta(
    korisnik int not null,
    sifra int not null primary key auto_increment,
    vrijeme datetime,
    djelatnik int,
    usluga int
);

create table djelatnik(
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    sifra int not null primary key auto_increment
);

create table korisnik(
    spol varchar(20) not null,
    dob varchar(10) not null,
    duzinakose varchar(20) null,
    sifra int not null primary key auto_increment,
    djelatnik int 
);

create table usluga(
    cijena decimal(18,2) null,
    sifra int not null primary key auto_increment,
    naziv varchar(50) null,
    trajanje varchar(20) null
);


alter table posjeta add foreign key(djelatnik) references djelatnik(sifra);
alter table posjeta add foreign key(korisnik) references korisnik(sifra);
alter table posjeta add foreign key(usluga) references usluga(sifra);
alter table korisnik add foreign key(djelatnik) references djelatnik(sifra);