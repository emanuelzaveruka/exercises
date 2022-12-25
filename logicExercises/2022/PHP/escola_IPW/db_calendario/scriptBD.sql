-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_calendario
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_calendario
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_calendario` DEFAULT CHARACTER SET utf8mb4 ;
USE `db_calendario` ;

-- -----------------------------------------------------
-- Table `db_calendario`.`categoria_tarefa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_calendario`.`categoria_tarefa` (
  `cod` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_calendario`.`perfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_calendario`.`perfil` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'id do usuario',
  `nome` VARCHAR(150) NULL DEFAULT NULL COMMENT 'nome do usuario',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_calendario`.`perfil_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_calendario`.`perfil_usuario` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'id do usuario',
  `nome` VARCHAR(150) NOT NULL COMMENT 'nome do usuario',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_calendario`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_calendario`.`usuario` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NULL DEFAULT NULL,
  `email` VARCHAR(150) NULL DEFAULT NULL,
  `senha` VARCHAR(150) NULL DEFAULT NULL,
  `usuario_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
-- removido de acordo com a video aula  
-- INDEX `fk_perfil_usuario1` (`usuario_id` ASC) VISIBLE,
  CONSTRAINT `fk_perfil_usuario1`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `db_calendario`.`perfil` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_calendario`.`tarefas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_calendario`.`tarefas` (
  `cod` INT(11) NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `data` DATETIME NOT NULL,
  `hora` TIME NOT NULL,
  `descrição` VARCHAR(255) NULL DEFAULT NULL,
  `table1_cod` INT(11) NOT NULL,
  `perfil_id` INT(11) NOT NULL,
  PRIMARY KEY (`cod`),
-- removido de acordo com a video aula 
-- INDEX `fk_tarefas_table11` (`table1_cod` ASC) VISIBLE,
-- INDEX `fk_tarefas_perfil1` (`perfil_id` ASC) VISIBLE,
  CONSTRAINT `fk_tarefas_perfil1`
    FOREIGN KEY (`perfil_id`)
    REFERENCES `db_calendario`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tarefas_table11`
    FOREIGN KEY (`table1_cod`)
    REFERENCES `db_calendario`.`categoria_tarefa` (`cod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
