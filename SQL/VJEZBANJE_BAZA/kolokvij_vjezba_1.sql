drop database if exists obitelj;
create database obitelj;
use obitelj;

create table punac(
    sifra int not null primary key auto_increment,
    ogrlica int null,
    gustoca decimal(14,9) null,
    hlace varchar(41) not null
);

create table cura(
    sifra int not null primary key auto_increment,
    novcica decimal(16,5) not null,
    gustoca decimal(18,6) not null,
    lipa decimal(13,10) null,
    ogrlica int not null,
    bojakose varchar(38) null,
    suknja varchar(36) null,
    punac int null
);

alter table cura add foreign key(punac) references punac(sifra);

create table sestra(
    sifra int not null primary key auto_increment,
    introvertno bit null,
    haljina varchar(31) not null,
    maraka decimal(16,6) null,
    hlace varchar(46) not null,
    narukvica int not null
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojaociju varchar(40) not null,
    prstena int null,
    dukserica varchar(41) null,
    lipa decimal(13,8) null,
    eura decimal(12,7) null,
    majica varchar(35) null
);

create table sestra_svekar(
    sifra int not null primary key auto_increment,
    sestra int not null,
    svekar int not null
);

alter table sestra_svekar add foreign key(sestra) references sestra(sifra);
alter table sestra_svekar add foreign key(svekar) references svekar(sifra);

create table zena(
    sifra int not null primary key auto_increment,
    treciputa datetime null,
    hlace varchar(46) null,
    kratkamajica varchar(31) not null,
    jmbag char(11) not null,
    bojaociju varchar(39) not null,
    haljina varchar(44) null,
    sestra int not null
);

create table muskarac(
    sifra int not null primary key auto_increment,
    bojaociju varchar(50) not null,
    hlace varchar(30) null,
    modelnaocala varchar(43) null,
    maraka decimal(14,5) not null,
    zena int not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    suknja varchar(50) not null,
    kuna decimal(16,8) not null,
    drugiputa datetime null,
    asocijalno bit null,
    ekstrovertno bit not null,
    dukserica varchar(48) not null,
    muskarac int null
);

alter table zena add foreign key(sestra) references sestra(sifra);
alter table muskarac add foreign key(zena) references zena(sifra);
alter table mladic add foreign key(muskarac) references muskarac(sifra);


insert into sestra(sifra,haljina,hlace,narukvica) values(null,'roza','crne',1);
insert into sestra(sifra,haljina,hlace,narukvica) values(null,'crvena','plave',4);
insert into sestra(sifra,haljina,hlace,narukvica) values(null,'crna','crne',3);

insert into zena(sifra,kratkamajica,jmbag,bojaociju,sestra) values (null,'smedja','12345678910','zelena',3);
insert into zena(sifra,kratkamajica,jmbag,bojaociju,sestra) values (null,'smedja','12345678910','zelena',1);
insert into zena(sifra,kratkamajica,jmbag,bojaociju,sestra) values (null,'smedja','12345678910','zelena',2);

insert into muskarac(sifra,bojaociju,hlace,maraka,zena) values (null,'zelena','plave',134.65,1);
insert into muskarac(sifra,bojaociju,hlace,maraka,zena) values (null,'plava','crne',324.65,2);
insert into muskarac(sifra,bojaociju,hlace,maraka,zena) values (null,'zelena','smedje',19.4,3);

insert into svekar(sifra,bojaociju) values(null,'plava');
insert into svekar(sifra,bojaociju) values(null,'zelena');
insert into svekar(sifra,bojaociju) values(null,'zuta');

insert into sestra_svekar(sifra,sestra,svekar) values(null,2,1);
insert into sestra_svekar(sifra,sestra,svekar) values(null,1,3);
insert into sestra_svekar(sifra,sestra,svekar) values(null,3,2);

insert into cura(sifra,novcica,gustoca,ogrlica) values(null,213.5,12.4,2);
insert into cura(sifra,novcica,gustoca,ogrlica) values(null,43443.3,1.345,1);
insert into cura(sifra,novcica,gustoca,ogrlica) values(null,19.99,34.6,5);

update cura set gustoca=15.77
where sifra in (1,2,3);

insert into mladic(sifra,suknja,kuna,ekstrovertno,dukserica) values(null,'crvena',135.665,1,'crna');
insert into mladic(sifra,suknja,kuna,ekstrovertno,dukserica) values(null,'roza',12.56,1,'zelena');
insert into mladic(sifra,suknja,kuna,ekstrovertno,dukserica) values(null,'plava',34.65,0,'zlatna');

delete from mladic where kuna>15.78;

select kratkamajica from zena 
where hlace like '%ana%';

select a.dukserica, f.asocijalno, e.hlace
from svekar a 
inner join sestra_svekar b on a.sifra=b.svekar
inner join sestra c on b.sestra=c.sifra
inner join zena d on c.sifra=d.sestra
inner join muskarac e on d.sifra=e.zena
inner join mladic f on e.sifra=f.muskarac
where (d.hlace like 'a%' and c.haljina like '%ba%');

