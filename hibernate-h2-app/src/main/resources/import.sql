DROP TABLE buyers IF EXISTS;
CREATE TABLE IF NOT EXISTS buyers (id bigint, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO buyers (name) VALUES ('Bob');
INSERT INTO buyers (name) VALUES ('Dave');
INSERT INTO buyers (name) VALUES ('John');

DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigint, name VARCHAR(255), price integer, PRIMARY KEY (id));
INSERT INTO products (name, price) VALUES ('Milk', 20);
INSERT INTO products (name, price) VALUES ('Meat', 150);
INSERT INTO products (name, price) VALUES ('Groat', 40);
INSERT INTO products (name, price) VALUES ('Bread', 80);
INSERT INTO products (name, price) VALUES ('Butter', 120);