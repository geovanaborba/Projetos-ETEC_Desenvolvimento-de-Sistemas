<?php
class ConexaoBD{

 private $serverName = "localhost";
 private $userName = "root";
 private $password = "usbw";
 private $dbName = "projeto_final";


 public function conectar ()
 {
     $conn = new mysqli ($this->serverName, $this->password, $this->dbName)
     return $conn;
 }
 
}
 ?>