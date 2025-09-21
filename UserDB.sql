select * from contries;
select * from states;
select * from cities;

insert into contries(id,name) values(1,'India');
insert into contries(id,name) values(2,'US');

insert into states values(1,'KA',1);
insert into states values(2,'MH',1);

insert into states values(3,'US-S-1',2);
insert into states values(4,'US-S-2',2);

insert into cities values(1,'BGK',1);
insert into cities values(2,'DWD',1);

insert into cities values(3,'Thane',2);
insert into cities values(4,'Mumbai',2);

insert into cities values(5,'US-C-1',3);
insert into cities values(6,'US-C-2',3);

insert into cities values(7,'US-C-3',4);
insert into cities values(8,'US-C-4',4);