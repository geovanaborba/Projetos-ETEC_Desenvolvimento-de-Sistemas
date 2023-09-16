<?php
include_once 'paciente.php';
$p = new paciente();
$p->setNome("Arthur");
$p->setRg("10.236.564-9");
$p->setEndereco("Rua dos Alpes,25");
$p->setProfissao("Soldador");
echo 'Nome: '.$p->getNome().'<br>';
echo 'RG: '.$p->getRg().'<br>';
echo 'Endereço: '.$p->getEndereco().'<br>';
echo 'Profissão: '.$p->getProfissao().'<br>';
echo '<br>';
?>