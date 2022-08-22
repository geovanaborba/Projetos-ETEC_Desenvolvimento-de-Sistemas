<!DOCTYPE html>
<html lang="pt-BR">
<head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <meta http-equiv="X-UA-Compatible" content="ie=edge">
 <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
 <title>Resultado</title>
</head>
<body>
<div class="w3-container w3-teal">
 <h1>
 <?php
 $vcomp = $_POST['txtValorCompra'];
 $fpag = $_POST['cmbPag'];
 $por;
 if($fpag == "Depósito")
 {
 $por = 10;
 }
 elseif($fpag == "Boleto")
 {
 $por = 8;    
 }
 else
 {
 $por = 0;    
 }
 echo "PROMOÇÃO MÊS DE ANIVERSÁRIO <br>";
 echo "".$_POST['txtNome']."! <br> ";
 echo "Valor da Compra sem Desconto: R$: ".$vcomp."<br>";
 echo "Forma de Pagamento Escolhida: ".$_POST['cmbPag']."<br>";
 echo "Desconto de: ".$por. "% <br>";
 echo "Você economizou: R$: ".($por * $vcomp / 100)."<br>";
 echo "Valor à Pagar: R$: ".($vcomp - $por * $vcomp / 100);
 ?>
 </h1>
</div>
</body>
</html>
