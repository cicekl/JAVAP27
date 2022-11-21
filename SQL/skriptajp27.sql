-- kopirati u: C:\xampp\mysql\bin\mysql -uroot <C:\Users\loren\Documents\JP27\SQL\skriptajp27.sql
-- tablice u bazi i stvaranje baze

drop database if exists edunovajp27;
create database edunovajp27;
use edunovajp27;
create table smjer(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    cijena decimal(18,2),
    upisnina decimal(18,2),
    certificiran boolean 
);

create table grupa(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    maksimalnopolaznika int,
    datumpocetka datetime,
    smjer int,
    predavac int 
);

create table predavac(
    sifra int not null primary key auto_increment,
    osoba int,
    iban varchar(50)
);

create table polaznik(
    sifra int not null primary key auto_increment,
    osoba int,
    brojugovora varchar(20)
);

create table clan(
    grupa int,
    polaznik int
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    email varchar(50),
    oib char(11) 
);

-- vanjski ključevi
-- mijenjaju se tablice koje imaju više veza ili ako nemaju veze, postoji bar jedan vanjski ključ
-- alter table ime_tablice add foreign key(key_name) references key_name(atribut)

alter table grupa add foreign key (smjer) references smjer(sifra);
alter table grupa add foreign key (predavac) references predavac(sifra);

alter table clan add foreign key (grupa) references grupa(sifra);
alter table clan add foreign key (polaznik) references polaznik(sifra);

alter table polaznik add foreign key (osoba) references osoba(sifra);

alter table predavac add foreign key (osoba) references osoba(sifra);
