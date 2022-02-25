-- -----------------------------------------------------
-- Table "HTTP_CODE"
-- -----------------------------------------------------
CREATE TABLE  HTTP_CODE (
  "http_code" SERIAL NOT NULL,
  "http_name" VARCHAR(45) NOT NULL,
  "http_description" VARCHAR(45) NULL,
  PRIMARY KEY ("http_code"));


-- -----------------------------------------------------
-- Table "OSI_MODEL"
-- -----------------------------------------------------
CREATE TABLE  OSI_MODEL (
  "layer_id" SERIAL NOT NULL,
  "name" VARCHAR(45) NOT NULL,
  "http_description" VARCHAR(45) NULL,
  "example" VARCHAR(255) NULL,
  PRIMARY KEY ("layer_id"));

-- -----------------------------------------------------
-- Table "PORTS"
-- -----------------------------------------------------
CREATE TABLE  PORTS (
  "port_number" SERIAL NOT NULL,
  "name" VARCHAR(45) NOT NULL,
  "description" VARCHAR(45) NULL,
  PRIMARY KEY ("port_number"));

-- -----------------------------------------------------
-- Table "SECURITY_CONCEPTS"
-- -----------------------------------------------------
CREATE TABLE  SECURITY_CONCEPTS (
  "http_code" SERIAL NOT NULL,
  "http_name" VARCHAR(45) NOT NULL,
  "http_description" VARCHAR(45) NULL,
  PRIMARY KEY ("http_code"));