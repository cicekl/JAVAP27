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
    naziv varchar(50)  not null,
    trajanje varchar(20)  not null
);


alter table posjeta add foreign key(djelatnik) references djelatnik(sifra);
alter table posjeta add foreign key(korisnik) references korisnik(sifra);
alter table posjeta add foreign key(usluga) references usluga(sifra);
alter table korisnik add foreign key(djelatnik) references djelatnik(sifra);


insert into djelatnik(ime,prezime,sifra) values('Pero','Peric',null);

insert into djelatnik(ime,prezime,sifra) values('Ivo','Ivic', null);

insert into korisnik(spol,dob,sifra,djelatnik) values('zensko','23',null,1);

insert into korisnik(spol,dob,sifra,djelatnik) values('musko','48',null,2);

insert into usluga(sifra,naziv,trajanje) values(null,'pranje kose','30 minuta');

insert into usluga(sifra,naziv,trajanje) values(null,'bojanje kose','3 sata');

insert into posjeta(korisnik,sifra,vrijeme,djelatnik,usluga) values(1,null,'2022-8-25 17:00:00',1,1);

insert into posjeta(korisnik,sifra,vrijeme,djelatnik,usluga) values(2,null,'2022-11-26 13:00:00',2,2);