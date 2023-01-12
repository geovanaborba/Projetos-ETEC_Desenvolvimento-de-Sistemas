## Agenda 6 - Exibição de tabela utilizando SQL

### Descrição da atividade: 

Inês, professora de Inglês, ficou sabendo que Gabriela estudava programação, ficou interassada e pediu para ela desenvolver uma página para exibir as notas de cada um dos 4 módulos de inglês, de cada aluno concluinte da escola, oferecendo para Gabriela desconto em sua mensalidade.

Gabriela ficou muito interessada e começou a buscar informações para desenvolver o projeto. Por sorte a escola, possui um banco de dados, que contém uma tabela, com o código do aluno, seu nome e as notas dos quatros módulos de cada um dos alunos concluintes.

Utilizando o que foi visto até agora, vamos criar a página solicitada, com a seguinte tabela.

![image](https://user-images.githubusercontent.com/98980485/212168652-1719e057-1765-4921-9f3f-f0650d117b04.png)

<hr>

### Script SQL feito para criação da tabela AlunoConcluinte e inserção de registros dos alunos.

```
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
```

<hr>

O resultado deverá ser exibido ao usuário em forma de tabela conforme demonstra a imagem a seguir.

![image](https://user-images.githubusercontent.com/98980485/212169450-1c9c6df8-0836-4f53-98fb-ce04d4eaedab.png)
