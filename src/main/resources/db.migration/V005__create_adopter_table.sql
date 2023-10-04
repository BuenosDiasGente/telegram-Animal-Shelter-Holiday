CREATE TABLE IF NOT EXISTS adopter(
id INT8 PRIMARY KEY NOT NULL,
first_name VARCHAR(50),
last_name VARCHAR(50),
probExtend INT,
shelter_id INT8 REFERENCES shelter(id),
volunteer_id INT8 REFERENCES volunteer(id)
);
CREATE SEQUENCE adopter_sequence START 1 INCREMENT 1;