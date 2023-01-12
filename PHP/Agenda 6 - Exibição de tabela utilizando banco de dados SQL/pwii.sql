CREATE DATABASE `pwii`;

CREATE TABLE  `pwii`.`alunoconcluinte` (
  `idalunoconcluinte` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `nota 1` FLOAT NOT NULL,
  `nota 2` FLOAT NOT NULL,
  `nota 3` FLOAT NOT NULL,
  `nota 4` FLOAT NOT NULL,
  PRIMARY KEY (`idalunoconcluinte`));

INSERT INTO `pwii`.`alunoconcluinte` (`nome`, `nota 1`, `nota 2`, `nota 3`, `nota 4`) VALUES ('Eduarda', '10', '10', '9', '10');
INSERT INTO `pwii`.`alunoconcluinte` (`nome`, `nota 1`, `nota 2`, `nota 3`, `nota 4`) VALUES ('Paulo', '10', '9', '8', '9');
INSERT INTO `pwii`.`alunoconcluinte` (`nome`, `nota 1`, `nota 2`, `nota 3`, `nota 4`) VALUES ('Igor', '10', '8', '10', '10');
INSERT INTO `pwii`.`alunoconcluinte` (`nome`, `nota 1`, `nota 2`, `nota 3`, `nota 4`) VALUES ('Guilherme', '10', '9', '8', '7');
INSERT INTO `pwii`.`alunoconcluinte` (`nome`, `nota 1`, `nota 2`, `nota 3`, `nota 4`) VALUES ('Henrique', '9', '9', '8', '7');
INSERT INTO `pwii`.`alunoconcluinte` (`nome`, `nota 1`, `nota 2`, `nota 3`, `nota 4`) VALUES ('Nilson', '10', '9', '10', '9');
INSERT INTO `pwii`.`alunoconcluinte` (`nome`, `nota 1`, `nota 2`, `nota 3`, `nota 4`) VALUES ('Ana', '9', '9', '8', '8');
INSERT INTO `pwii`.`alunoconcluinte` (`nome`, `nota 1`, `nota 2`, `nota 3`, `nota 4`) VALUES ('Amanda', '8', '9', '9', '8');
INSERT INTO `pwii`.`alunoconcluinte` (`nome`, `nota 1`, `nota 2`, `nota 3`, `nota 4`) VALUES ('Carlos', '6', '6', '5', '6');
INSERT INTO `pwii`.`alunoconcluinte` (`nome`, `nota 1`, `nota 2`, `nota 3`, `nota 4`) VALUES ('Pedro', '8', '8', '8', '7');
