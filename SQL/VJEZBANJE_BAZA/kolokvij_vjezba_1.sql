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
    suknja varchar(50) not null,
    kuna decimal(16,8) not null,
    drugiputa datetime null,
    asocijalno bit null,
    ekstrovertno bit not null,
    dukserica varchar(48) not null,
    zena int null
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