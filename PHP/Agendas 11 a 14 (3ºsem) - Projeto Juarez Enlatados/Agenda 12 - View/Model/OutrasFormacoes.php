<?php
class Outrasformacoes
{
private $idoutrasformacoes;
private $idusuario;
private $inicio;
private $fim;
private $descricao;

//IdOutrasInformacoes

public function SetIdOutrasInformacoes($idoutrasformacoes)
{
$this->id = $idoutrasformacoes;
}
public function getIdOutrasInformacoes()
{
   return $this->idoutrasformacoes;
}

//IdUsuario
public function SetIdUsuario($idusuario)
{
$this->idusuario = $idusuario;
}
public function getIdUsuario()
{
   return $this->idusuario;
}

//Inicio
public function SetInicio($inicio)
{
$this->inicio = $inicio;
}
public function getInicio()
{
   return $this->inicio;
}

//Fim
public function SetFim($fim)
{
$this->fim = $fim;
}
public function getFim()
{
   return $this->fim;
}

//Descricao
public function SetDescricao($descricao)
{
$this->descricao = $descricao;
}
public function getDescricao()
{
   return $this->descricao;
}

public function inserirBD()
{
   require_once 'ConexaoBD.php';
   $con = new ConexaoBD();
   $conn = $con->conectar();
   if ($conn->connect_error){

     die("Connection failed: " .$conn->connect_error);
   }
  
   $sql = "INSERT INTO outrasformacoes (idoutrasformaçoes,idusuario, inicio, fim, descricao)
   VALUES ('".$this->idoutrasformacoes."','".$this->idusuario."','".$this->inicio."','".$this->fim."','".$this->descricao."')";

if ($conn->query($sql) === TRUE){
    $this->id = mysqli insert id($conn);
    $conn->close();
    return TRUE;

}else{
   $conn->close();
   return FALSE;
}

}

public function excluirBD()
{
   require_once 'ConexaoBD.php';
   $con = new ConexaoBD();
   $conn = $con->conectar();
   if ($conn->connect_error){

     die("Connection failed: " .$conn->connect_error);
   }
   $sql = "DELETE FROM outrasformacoes WHERE outrasformacoes = '".$idoutrasformacoes."';";

   if ($conn->query($sql) === TRUE){
   
    $conn->close();
    return TRUE;

}else{
   $conn->close();
   return FALSE;
}

public function outrasFormacoes($idusuario)
{
    require_once 'ConexaoBD.php';
    $con = new ConexaoBD();
    $conn = $con->conectar();
    if ($conn->connect_error){
 
      die("Connection failed: " .$conn->connect_error);
    }


$sql = "SELECT * FROM outrasformacoes WHERE  idusuario = '".$idusuario."'";
$re = $conn->query($sql);
$conn->close();
return $re;
}

}



?>