CREATE TABLE IF NOT EXISTS contract(
id INT8 PRIMARY KEY NOT NULL,
contract_data DATE,
animal_id INT8 REFERENCES animal(id),
 adopter_id INT8 REFERENCES adopter(id)
);

CREATE SEQUENCE contract_sequence START 3 INCREMENT 1;

INSERT INTO contract (id,contract_data)
VALUES (1,'2023.12.6'),
       (2,'2023.12.2');