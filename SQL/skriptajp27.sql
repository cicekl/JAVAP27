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


# inicijalni podaci
# najlošija
# 1 - ovo je šifra smjera koju dodjeli server
insert into smjer
values (null,'Java programiranje',5999.99,
500,true);

# malo bolja varijanta
# 2
insert into smjer (sifra,naziv)
values (null,'PHP programiranje');

# primjer dobre prakse - navesti sve kolone koje unosiš
# 3
insert into smjer
(sifra,naziv,cijena,upisnina,certificiran)
values
(null,'Serviser',null,null,null);

# 1
insert into grupa (naziv,sifra,maksimalnopolaznika,
datumpocetka, smjer,predavac)
values ('JP27',null,20,'2022-11-07',1,null);

# 2
insert into grupa(naziv,maksimalnopolaznika,smjer, datumpocetka)
values ('PP26',20,2,'2022-11-07 19:00:00');


# 1 - 14
insert into osoba(ime,prezime,email)
values
('Kristijan','Ratković','ratkovic.kristijan@gmail.com'),
('Kristijan','Vidaković','kristijan.vidakovic111@gmail.com'),
('Isidora','Karan','karanisidora@hotmail.com'),
('Martina','Novoselac','novoselac.martina@gmail.com'),
('Lorena','Čiček','cicek.lorena@gmail.com'),
('Marko','Mijatović','mijat5555@gmail.com'),
('Marko','Perak','markoperak469@gmail.com'),
('Lovre','Burazer-Pavešković','lburazer8@gmail.com'),
('Krunoslav','Kasalo','kkruno25@msn.com'),
('Karlo','Odobašić','karloodobasic26@gmail.com'),
('Karlo','Kapl','kaplkarlo0@gmail.com'),
('Ivan','Dubravac','ivandubravac99@gmail.com'),
('Mario','Živković','mario.zivkovic.znr@gmail.com'),
('Toni','Stojčević','stojcevict@gmail.com');



# 1 - 14
insert into polaznik (osoba) values
(1),(2),(3),(4),(5),(6),(7),(8),(9),
(10),(11),(12),(13),(14);


# 15
insert into osoba (ime,prezime,email)
values ('Tomislav','Jakopec',
'tjakopec@gmail.com');


# 1 
insert into predavac(osoba)
values (15);



insert into clan (grupa,polaznik)
values
(1,1),(1,2),(1,3),(1,4),(1,5),
(1,6),(1,7),(1,8),(1,9),(1,10),
(1,11),(1,12),(1,13),(1,14);


update grupa set 
datumpocetka='2022-11-07 17:00:00'
where sifra=1;

delete from smjer where sifra=3;

# do sada radili
select * from smjer;
#minimalni oblik select naredbe
select 1;

#filtriranje kolona
select sifra,naziv from smjer;
#1. nazivi kolona odvojeni zarezom
select sifra,naziv,sifra from smjer;

#2. * sve kolone
select*,naziv from smjer;

#3. konstanta
select naziv, 'Osijek' from smjer;
#zamjensko ime kolone
select naziv, 'Osijek' as mjesto from smjer;

#4. izraz
select naziv,
length(naziv) as duzina from smjer;

#ispisite imena i prezimena osoba

select ime,prezime from osoba;

#FILTRIRANJE REDOVA
select * from osoba;

select * from osoba where sifra=1;

#operatori (=,<,>,<=,>=,!=) usporedivanja

select * from osoba
where sifra<=5;

select * from osoba where ime='Kristijan';

#logicki operatori (not,and,or,xor)

select * from osoba 
where ime='Kristijan' and prezime='Vidaković';

select * from osoba 
where ime='Kristijan' or ime='Karlo';

select * from osoba where not (ime='Kristijan');

select * from osoba where (ime='Kristijan' and sifra<10) or 
(sifra>=12 and ime='Ivan');

#ostali operatori (like, between)
select * from osoba where ime like 'K%'; #prvo K pa sve ostalo, sva imena na K

select * from osoba where prezime like 'K%';

#sve zenske osobe
select * from osoba 
where ime like '%a';

#sve osobe koje sadrze u prezimenu nt
select * from osoba 
where prezime like '%vid%';

#unijeti tri nove grupe, svaka u različitoj godini (2019,2020,2021);

insert into grupa(sifra,naziv,datumpocetka) values(null,'JP26', '2021-11-7');

insert into grupa(sifra,naziv,datumpocetka) values(null,'JP25', '2020-11-7');

insert into grupa(sifra,naziv,datumpocetka) values(null,'JP24', '2019-11-7');


select * from grupa where datumpocetka>'2020-01-01';

select * from grupa where datumpocetka between '2020-01-01' and '2020-12-31';


select * from osoba 
where sifra between 3 and 9;

#izlistajte sve grupe kojima se ne zna predavac

select * from grupa where predavac is null;

#unesite novog predavaca

insert into osoba(sifra,ime,prezime,email) values(null,'Shaquille','ONeal','shaki@gmail.com');

insert into predavac (sifra,osoba) values(null,16);

