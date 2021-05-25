drop database if exists sandwich_db;

create database sandwich_db;
USE sandwich_db;

create table sandwich(
	sandwich_id INT primary key AUTO_INCREMENT,
	sandwich_name VARCHAR(50) not null,
	bread_type VARCHAR(25) not null,
	cheese_type VARCHAR(50),
	meat_type VARCHAR(50) not null,
	veggie_type VARCHAR(50) not null,
	sauce_type VARCHAR(25),
	sandwich_price DOUBLE not null
	
);

insert into sandwich(sandwich_name,bread_type,cheese_type,meat_type,veggie_type,sauce_type,sandwich_price)
values

('The BK Special', 'Italian Hero', 'Cheddar Cheese', 'Pastrami & Chicken Cutlet', 'Arugala, Tomatoes, Avacado', 'Chipotle Mayo', 14.00),
('The Ruben', 'Rye', 'Swiss', 'CornBeef', 'Sauerkraout','Thousand Island Dressing', 7.99),
('The Tuna', 'White Bread', null, 'Tuna', 'Relish', 'Mayo', 6.99),
('Chicken Tender Sub', 'Italian Herb & Cheese', 'Pepper Jack', 'Chicken Tenders', 'Lettuce, Onions, Jalapenos', 'Mayo', 8.99),
('Chicken Roti', 'Garlic Naan', null, 'Chicken Tandori', 'Onions, RedPeppers, Garlic', 'Masala, Chutney', 6.99 ),
('TBLT', 'Sourdough', null, 'Turkey Bacon', 'Lettuce, Tomatoes', 'Mayo', 5.99);


commit;
