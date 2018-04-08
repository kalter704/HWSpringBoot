CREATE TABLE company
(
  id INTEGER not null,
  title VARCHAR(255),
  PRIMARY KEY (id)
);

INSERT INTO company(id, title) VALUES (1, 'Google');
INSERT INTO company(id, title) VALUES (2, 'Apple');
INSERT INTO company(id, title) VALUES (3, 'Microsoft');
INSERT INTO company(id, title) VALUES (4, 'Sberbank');
INSERT INTO company(id, title) VALUES (5, 'Redmadrobot');

CREATE TABLE owner
(
  id INTEGER not null,
  companyId INTEGER not null,
  firstName VARCHAR(255),
  secondName VARCHAR(255),
  PRIMARY KEY (id)
);

INSERT INTO owner(id, companyId, firstName, secondName) VALUES (1, 1, 'Ivan', 'Ivanov');
INSERT INTO owner(id, companyId, firstName, secondName) VALUES (2, 1, 'Petr', 'Petrov');
INSERT INTO owner(id, companyId, firstName, secondName) VALUES (3, 3, 'Dima', 'Makarov');
INSERT INTO owner(id, companyId, firstName, secondName) VALUES (4, 4, 'Victor', 'Li');
INSERT INTO owner(id, companyId, firstName, secondName) VALUES (5, 5, 'Stepan', 'Petrov');

CREATE TABLE account
(
  id INTEGER not null,
  ownerId INTEGER not null,
  name VARCHAR(255),
  rate FLOAT(24),
  PRIMARY KEY (id)
);

INSERT INTO account(id, ownerId, name, rate) VALUES (1, 1, 'acc1', 7.2);
INSERT INTO account(id, ownerId, name, rate) VALUES (2, 2, 'acc2', 9.1);
INSERT INTO account(id, ownerId, name, rate) VALUES (3, 3, 'acc3', 5.5);
INSERT INTO account(id, ownerId, name, rate) VALUES (4, 4, 'acc4', 6.4);
INSERT INTO account(id, ownerId, name, rate) VALUES (5, 5, 'acc5', 3.6);