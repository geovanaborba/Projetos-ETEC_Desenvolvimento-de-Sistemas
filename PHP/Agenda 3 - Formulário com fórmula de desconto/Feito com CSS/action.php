<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="./styles/style.css">
    <title>Resultado</title>
</head>
<body class="body-action">


    <header class="action-container">

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
        ?>
        </header>

        <section class="action-resultado">
        <?php 

        echo "<h2>".$_POST['txtNome']."! <br><br> </h2>";
        echo "Valor da Compra sem Desconto: R$: ".$vcomp."<br>";
        echo "Forma de Pagamento Escolhida: ".$_POST['cmbPag']."<br>";
        echo "Desconto de: ".$por. "% <br>";
        echo "Você economizou: R$: ".($por * $vcomp / 100)."<br><br>";
        echo "Valor à Pagar: R$: ".($vcomp - $por * $vcomp / 100);
        ?>
        </section>
 

</body>

</html>