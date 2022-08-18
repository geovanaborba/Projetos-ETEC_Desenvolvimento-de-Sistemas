<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" type="text/css" href="./css/reset.css">
<div class="w3-container w3-teal">

<h2>Cadastro Confirmado com Sucesso</h2>



<?php

//Nome 
$txtNome = $_POST['txtNome'];
echo "<p>"."Nome: ".$_POST['txtNome']."</p>";

//Sobrenome 
$txtSobrenome = $_POST['txtSobrenome'];
echo "<p>"."Sobrenome: ".$_POST['txtSobrenome']."</p>";

//Email
$txtEmail = $_POST['txtEmail'];
echo "<p>"."Email: ".$_POST['txtEmail']."</p>";

//Formação
$txtFormacao = $_POST['txtFormacao'];
echo "<p>"."Formação: ".$_POST['txtFormacao']."</p>";

//Desc Emprego
$txtEmprego = $_POST['txtEmprego'];
echo "Descrição Último Emprego: ".$txtEmprego;
?>
</div>
