drop database if exists vjezba4;
create database vjezba4;
use vjezba4;

create table punac(
    sifra int not null primary key auto_increment,
    treciputa datetime null,
    majica varchar(46) null,
    jmbag char(11) not null,
    novcica decimal(18,7) not null,
    maraka decimal(12,6) not null,
    ostavljen int not null
);

create table ostavljen(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(43) null,
    introvertno bit null,
    kuna decimal(14,10) null
);

alter table punac add foreign key(ostavljen) references ostavljen(sifra);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno bit null,
    treciputa datetime null,
    haljina varchar(44) not null,
    zena int not null
);

create table becar(
    sifra int not null primary key auto_increment,
    novcica decimal(14,8) null,
    kratkamajica varchar(46) not null,
    bojaociju varchar(36) not null,
    snasa int not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    eura decimal(16,9) null,
    prstena int not null,
    gustoca decimal(16,5) null,
    jmbag char(11) not null,
    suknja varchar(47) not null,
    besar int not null
);

create table zena(
    sfira int not null primary key auto_increment,
    suknja varchar(39) not null,
    lipa decimal(18,7) null,
    prstena int not null
);

create table zena_mladic(
    sifra int not null primary key auto_increment,
    zena int not null,
    mladic int not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    kuna decimal(15,9) null,
    lipa decimal(18,5) null,
    nausnica int null,
    stilfrizura varchar(49) null,
    vesta varchar(34) not null
);

alter table snasa add foreign key(zena) references zena(sifra);
alter table becar add foreign key(snasa) references snasa(sifra);
alter table prijatelj add foreign key(becar) references becar(sifra);
alter table zena_mladic add foreign key(zena) references zena(sifra);
alter table zena_mladic add foreign key(mladic) references mladic(sifra);

--becar,snasa,zena_mladic
insert into zena(suknja,prstena)
values('da',1),('ne',5),('da',3);

insert into snasa(haljina,zena)
values('crvena',1),('plava',2),('crna',3);

insert into becar(kratkamajica,bojaociju,snasa)
values('da','plava',1),('da','smedja',2),('ne','zelena',3);

insert into mladic(vesta)
values('zelena'),('smedja'),('zlatna');

insert into zena_mladic(zena,mladic)
values(1,2),(2,3),(3,1);

update punac set majica='Osijek'
where sifra is not null;

delete from prijatelj 
where prsten>17;

select haljina from snasa
where treciputa is null;

select a.nausnica, f.jmbag, e.kratkamajica
from mladic a 
inner join zena_mladic b on a.sifra=b.mladic
inner join zena c on b.zena=c.sifra
inner join snasa d on c.sifra=d.zena
inner join becar e on d.sifra=e.snasa
inner join prijatelj f on e.sifra=f.becar
where d.treciputa is not null and c.lipa!=29
order by e.kratkamajica desc;

select 
from zena a
left join zena_mladic b on a.sifra=b.zena
where b.zena is null; 
