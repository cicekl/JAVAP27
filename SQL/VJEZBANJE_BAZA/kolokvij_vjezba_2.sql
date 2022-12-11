drop database if exists vjezba2;
create database vjezba2;
use vjezba2;

create table decko(
    sifra int not null primary key auto_increment,
    indiferentno bit null,
    vesta varchar(34) null,
    asocijalno bit not null
);

create table zarucnica(
    sifra int not null primary key auto_increment,
    narukvica int null,
    bojakose varchar(37) not null,
    novcica decimal(15,9) null,
    lipa decimal(15,8) not null,
    indiferentno bit not null
);

create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int not null,
    zarucnica int not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(37) null,
    treciputa datetime not null,
    ekstrovertno bit not null,
    prviputa datetime null,
    svekar int not null
);

create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(40) null,
    ogrlica int not null,
    asocijalno bit not null
);

create table brat(
    sifra int not null primary key auto_increment,
    suknja varchar(47) null,
    ogrlica int not null,
    asocijalno bit not null,
    neprijatelj int not null
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    majica varchar(32) null,
    haljina varchar(43) not null,
    lipa decimal(16,8) null,
    modelnaocala varchar(49) not null,
    kuna decimal(12,6) not null,
    jmbag char(11) null,
    cura int null
);

create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar(33) not null,
    drugiputa datetime not null,
    suknja varchar(38) null,
    narukvica int null,
    introvertno bit null,
    majica varchar(40) not null,
    decko int null
);


alter table cura add foreign key(decko) references decko(sifra);
alter table decko_zarucnica add foreign key (decko) references decko(sifra);
alter table decko_zarucnica add foreign key(zarucnica) references zarucnica(sifra);
alter table neprijatelj add foreign key(cura) references cura(sifra);
alter table brat add foreign key(neprijatelj) references neprijatelj(sifra);
alter table prijatelj add foreign key(svekar) references svekar(sifra);

--neprijatelj, cura, decko_zarucnica

insert into neprijatelj(sifra,haljina,modelnaocala,kuna) 
values(null,'crvena','Calvin Klein',123446.698),(null,'plava','Chloe',3982754.3453),(null,'crna','Lacoste',45.2);

insert into cura(sifra,haljina,drugiputa,majica) values(null,'plava',1980-11-23, 'crna'),(null,'roza',2022-12-10,'roza'),
(null,'crna',2002-8-25,'crvena');

insert into decko(sifra,asocijalno) values(null,1),(null,0),(null,1);

insert into zarucnica(sifra,bojakose,lipa,indiferentno) values(null,'crna',4245.54,1),
(null,'plava',434.43,0),(null,'ljubicasta',4334433.5445,0);

insert into decko_zarucnica(sifra,decko,zarucnica) values(null,1,3),
(null,2,1),(null,3,2);

update prijatelj set treciputa=2020-4-30;

delete from brat where ogrlica!=14;

select suknja from cura where drugiputa is null;

select a.novcica, f.neprijatelj, e.haljina
from zarucnica a 
inner join decko_zarucnica b on a.sifra=b.zarucnica
inner join decko c on b.decko=c.sifra 
inner join cura d on c.sifra=d.decko
inner join neprijatelj e on d.sifra=e.cura
inner join brat f on e.sifra=f.neprijatelj
where d.drugiputa is not null and c.vesta like '%ba%'
order by e.haljina desc;

select a.vesta, a.asocijalno
from decko a
left join decko_zarucnica b on a.sifra=b.decko
where b.decko is null;

--38 minuta 
