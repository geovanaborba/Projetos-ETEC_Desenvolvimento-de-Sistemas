<?php
class Usuario
{
 private $id;
 private $nome;
 private $cpf;
 private $email;
 private $dataNascimento;
 private $senha;


//ID 
public function SetID($id)
{
$this->id = $id;
}
public function getID()
{
   return $this->id;
}

//nome
public function SetNome($nome)
{
$this->nome = $nome;
}
public function getNome()
{
   return $this->nome;
}

//cpf
public function SetCPF($cpf)
{
$this->cpf = $cpf;
}
public function getCPF()
{
   return $this->cpf;
}

//Email
public function SetEmail($email)
{
$this->email = $email;
}
public function getEmail()
{
   return $this->email;
}

//Data de Nascimento 
public function SetDataNascimento($dataNascimento)
{
$this->dataNascimento = $dataNascimento;
}
public function getDataNascimento()
{
   return $this->dataNascimento;
}

//Senha
public function SetSenha($senha)
{
$this->senha = $senha;
}
public function getSenha()
{
   return $this->senha;
}

public function inserirBD()
{
   require_once 'ConexaoBD.php';
   $con = new ConexaoBD();
   $conn = $con->conectar();
   if ($conn->connect_error){

     die("Connection failed: " .$conn->connect_error);
   }
   $sql = "INSERT INTO usuario (nome, cpf, email, senha)
   VALUES ('".$this->nome."', '".$this->cpf."', '".$this->email."','".$this->senha."')"

   if ($conn->query($sql) === TRUE){
       $this->id = mysqli insert id($conn);
       $conn->close();
       return TRUE;

   }else{
      $conn->close();
      return FALSE;
   }

}
 
public function carregarUsuario($cpf)
{
 require_once 'ConexaoBD.php';
 $con = new ConexaoBD();
 $conn = $con->conectar();
 if ($conn->connect_error){

   die("Connection failed: " .$conn->connect_error); 
 }

 $sql = "SELECT * FROM usuario WHERE cpf = ".$cpf;
 $re = $conn->query($sql);
 $r = $re->fetch_object();
 if($r != null){

   $this->id = $r->idusuario;
   $this->nome = $r->nome;
   $this->email = $r->email;
   $this->cpf = $r->cpf;
   $this->dataNascimento = $r->dataNascimento;
   $this->senha = $r->senha;
   $conn->close();
   return TRUE;
 }
 else
 {
    $conn->close();
    return FALSE;
 }
}

public function atualizarBD()
{
 require_once 'ConexaoBD.php';
 $con = new ConexaoBD();
 $conn = $con->conectar();
 if ($conn->connect_error){

   die("Connection failed: " .$conn->connect_error); 
 }

 $sql = "UPDATE usuario SET nome = '".$this->nome."', cpf = '". $this->cpf."', dataNascimento = 
 '". $this->dataNascimento."',
    email='".$this->email."' WHERE idsuario ='" .$this->id. "'" ;
    if ($conn->query($sql) === TRUE){
      $conn->close();
      return TRUE;

  }else{
     $conn->close();
     return FALSE;
  }

}

}


?>