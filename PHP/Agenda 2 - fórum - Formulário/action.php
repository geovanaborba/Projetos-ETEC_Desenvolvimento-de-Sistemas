<!DOCTYPE html>

<html lang="pt-BR">

<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="./css/styles.css">

    <title>Formulário</title>

</head>

<body>
    <header class="container-action">
        <h1>DADOS CONFIRMADOS: </h1>
    </header>

    <section class="contents-action">
        <?php
            $ano = $_POST['ano'];
            $idade = 2022 - $ano;
            echo "<p>"."Olá ".$_POST['nome'].","."<p>"." este ano você irá completar ".$idade." anos.";
        ?>
    </section>
</body>

</html>