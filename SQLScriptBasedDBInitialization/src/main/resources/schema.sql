DROP TABLE IF EXISTS bank_account;
CREATE TABLE bank_account (
  accountno bigint NOT NULL AUTO_INCREMENT,
  balance bigint NOT NULL,
  owner varchar(255) DEFAULT NULL,
  PRIMARY KEY (accountno)
);