CREATE SCHEMA IF NOT EXISTS ecomm;

CREATE TABLE IF NOT EXISTS ecomm.customer (
    id              uuid NOT NULL DEFAULT random_uuid(),
    username        varchar(16),
    password        varchar(40),
    first_name      varchar(16),
    last_name       varchar(16),
    email           varchar(24),
    phone           varchar(24),
    user_status     varchar(16),
    PRIMARY KEY(id)
);

create TABLE IF NOT EXISTS ecomm.address (
    id              uuid NOT NULL DEFAULT random_uuid(),
    number          varchar(24),
    residency       varchar(32),
    street          varchar(32),
    city            varchar(24),
    state           varchar(24),
    country         varchar(24),
    pincode         varchar(10),
    PRIMARY KEY(id)
);

create TABLE IF NOT EXISTS ecomm.customer_address (
    customer_id         uuid NOT NULL DEFAULT random_uuid(),
    address_id          uuid NOT NULL,
    FOREIGN KEY (customer_id)
        REFERENCES ecomm.customer(id),
    FOREIGN KEY(address_id)
        REFERENCES ecomm.address(id)
);

insert into ecomm.customer (id, username, password, first_name, last_name, email, phone, user_status) values('a1b9b31d-e73c-4112-af7c-b68530f38222', 'test', 'pwd', 'Test', 'User', 'test@user.com', '234234234', 'ACTIVE');
insert into ecomm.customer (id, username, password, first_name, last_name, email, phone, user_status) values('a1b9b31d-e73c-4112-af7c-b68530f38223', 'test', 'pwd', 'Test2', 'User2', 'test2@user.com', '234234234', 'ACTIVE');
INSERT INTO ecomm.address VALUES ('a731fda1-aaad-42ea-bdbc-a27eeebe2cc0', '9I-999', 'Fraser Suites Le Claridge', 'Champs-Elysees', 'Paris', 'Île-de-France', 'France', '75008');
insert into ecomm.customer_address values ('a1b9b31d-e73c-4112-af7c-b68530f38222', 'a731fda1-aaad-42ea-bdbc-a27eeebe2cc0');
