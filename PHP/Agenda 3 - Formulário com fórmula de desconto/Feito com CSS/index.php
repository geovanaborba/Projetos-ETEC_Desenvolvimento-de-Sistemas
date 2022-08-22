<!DOCTYPE html>

<html lang="pt-BR">

<head>

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="./styles/style.css">

    <title>Atividade Online</title>

</head>

<body>

    <header>

        <h2>Forma de pagamento</h2>

    </header>

    
    <form method="post" action="action.php">

        <label>Nome do Cliente</label>

            <input name="txtNome" type="text">

        <label>Valor  da Compra</label>

            <input name="txtValorCompra" type="number">

        <label>Escolha a forma de Pagamento:</label>

            <select name = "cmbPag">
                <option value="Cartão de Credito">Cartão de Crédito</option>
                <option value="Boleto">Boleto</option>
                <option value="Depósito" selected>Depósito</option>
            </select>

        <button>Enviar</button>

    </form>
    
</body>

</html>
