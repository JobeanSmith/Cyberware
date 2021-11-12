CREATE TABLE customer
(
    identifier    INT AUTO_INCREMENT,
    first_name    VARCHAR(30)  NOT NULL,
    last_name     VARCHAR(30)  NOT NULL,
    email_address VARCHAR(50)  NOT NULL,
    phone_number  VARCHAR(20),
    address       VARCHAR(100) NOT NULL,
    password      VARCHAR(30)  NOT NULL,

    CONSTRAINT PRIMARY KEY (identifier),
    CONSTRAINT UNIQUE (email_address),
    CONSTRAINT UNIQUE (phone_number)
);

CREATE TABLE language
(
    identifier INT AUTO_INCREMENT,
    name       VARCHAR(30) NOT NULL,

    CONSTRAINT PRIMARY KEY (identifier),
    CONSTRAINT UNIQUE (name)
);

CREATE TABLE category
(
    identifier  INT AUTO_INCREMENT,
    description VARCHAR(400),

    CONSTRAINT PRIMARY KEY (identifier)
);

CREATE TABLE category_translation
(
    category INT,
    language INT,
    name     VARCHAR(30) NOT NULL,

    CONSTRAINT PRIMARY KEY (category, language),
    CONSTRAINT FOREIGN KEY (category) REFERENCES category (identifier),
    CONSTRAINT FOREIGN KEY (language) REFERENCES language (identifier)
);

CREATE TABLE item
(
    identifier  INT AUTO_INCREMENT,
    name        VARCHAR(30) NOT NULL,
    price       DOUBLE      NOT NULL,
    description VARCHAR(400),
    category    INT         NOT NULL,

    CONSTRAINT PRIMARY KEY (identifier),
    CONSTRAINT FOREIGN KEY (category) REFERENCES category (identifier)
);

CREATE TABLE purchase
(
    identifier INT AUTO_INCREMENT,
    is_paid    BOOLEAN   NOT NULL,
    date       TIMESTAMP NOT NULL,
    customer   INT       NOT NULL,

    CONSTRAINT PRIMARY KEY (identifier),
    CONSTRAINT FOREIGN KEY (customer) REFERENCES customer (identifier)
);

CREATE TABLE purchase_line
(
    item               INT,
    purchase           INT,
    item_price         DOUBLE NOT NULL,
    requested_quantity INT    NOT NULL,

    CONSTRAINT PRIMARY KEY (item, purchase),
    CONSTRAINT FOREIGN KEY (item) REFERENCES item (identifier),
    CONSTRAINT FOREIGN KEY (purchase) REFERENCES purchase (identifier)
);