drop database if exists vjezba3;
create database vjezba3;
use vjezba3;

create table svekar(
    sifra int not null primary key auto_increment,
    novcica decimal(16,8) not null,
    suknja varchar(44) not null,
    bojakose varchar(36) null,
    prstena int null,
    narukvica int not null,
    cura int not null
);

create table cura(
    sifra int not null primary key auto_increment,
    dukserica varchar(44) not null,
    maraka decimal(13,7) null,
    drugiputa datetime null,
    majica varchar(49) null,
    novcica decimal(15,8) null,
    ogrlica int
);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno bit null,
    kuna decimal(15,6) not null,
    eura decimal(12,9) not null,
    treciputa datetime null,
    ostavljena int not null
);

create table punica(
    sifra int not null primary key auto_increment,
    asocijalno bit null,
    kratkamajica varchar(44) null,
    kuna decimal(13,8) not null,
    vesta varchar(32) not null,
    snasa int null
);

create table ostavljena(
    sifra int not null primary key auto_increment,
    kuna decimal(17,5) null,
    lipa decimal(15,6) null,
    majica varchar(36) null,
    modelnaocala varchar(31) not null,
    prijatelj int null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    kuna decimal(16,10) null,
    haljina varchar(37) null,
    lipa decimal(13,10) null,
    dukserica varchar(31) null,
    indiferentno bit not null
);

create table prijatelj_brat(
    sifra int not null primary key auto_increment,
    prijatelj int not null,
    brat int not null
);

create table brat(
    sifra int not null primary key auto_increment,
    jmbag char(11) null,
    ogrlica int not null,
    ekstrovertno bit not null
);

alter table svekar add foreign key(cura) references cura(sifra);
alter table punica add foreign key(snasa) references snasa(sifra);
alter table ostavljena add foreign key(prijatelj) references prijatelj(sifra);
alter table prijatelj_brat add foreign key(prijatelj) references prijatelj(sifra);
alter table prijatelj_brat add foreign key(brat) references brat(sifra);
alter table snasa add foreign key(ostavljena) references ostavljena(sifra);

--snasa, ostavljena, prijatelj_brat - 3 retka
insert into ostavljena(modelnaocala) 
values('Calvin Klein'),('Chloe'),('Boss');

insert into snasa(kuna,eura,ostavljena)
values(14215.43,131.4,1),(5665.5,456.4,2),(324.4,32345.565,3);

insert into prijatelj(indiferentno) values(1),(1),(0);

insert into brat(ogrlica,ekstrovertno) 
values(1,1),(5,0),(34,1);

insert into prijatelj_brat(prijatelj,brat)
values(1,1),(2,3),(3,2);

update svekar set suknja='Osijek';
where sifra is not null;

delete from punica where kratkamajica='AB';

select majica from ostavljena 
where (lipa!=9 and lipa!=10 and lipa!=20 and lipa!=30 and lipa!=35);

select a.ekstrovertno, f.vesta, e.kuna
from brat a
inner join prijatelj_brat b on a.sifra=b.brat
inner join prijatelj c on b.prijatelj=c.sifra
inner join ostavljena d on c.sifra=d.prijatelj
inner join snasa e on d.sifra=e.ostavljena
inner join punica f on e.sifra=f.snasa
where d.lipa!=91 and c.haljina like '%ba'
order by e.kuna desc;

select a.haljina, a.lipa
from prijatelj a
left join prijatelj_brat b on a.sifra=b.prijatelj
where a.sifra=null;




