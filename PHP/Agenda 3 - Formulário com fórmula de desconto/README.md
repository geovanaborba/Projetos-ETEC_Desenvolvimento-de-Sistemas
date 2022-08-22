## Agenda 3 - Formulário com fórmula de desconto em php

### Descrição da atividade: 

A empresa Madeira e Cia Ltda. cliente da empresa Just Web ltda, está fazendo uma promoção de aniversário, que vai gerar descontos para seus clientes, porém, esses descontos serão diferentes para cada forma de pagamento disponível. Os pagamentos são aceitos de três formas, boleto, depósito e cartão de crédito. Durante uma reunião de gerência, surgiu a idéia de fomentar o pagamento por meio de depósito e boleto oferecendo descontos maiores (10% e 8% respectivamente) para ambos os casos, gerando assim um maior fluxo caixa para a empresa. Carlos foi designado para esse novo desafio. Recebendo da equipe de front-end um arquivo com um formulário contendo:

1 – Nome do Cliente

2 – Valor da Compra

3 – Forma de Pagamento.

![image](https://user-images.githubusercontent.com/98980485/186032630-c74ba76d-78fb-41a2-8cf7-9adfc304d476.png)

Imagem 13.  Imagem de arquivo em execução no navegador enviado pela equipe front-end.

<br>
<br>

Código enviado pela equipe de front-end


```
<!DOCTYPE html>

<html lang="pt-BR">

<head>
    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

    <title>Atividade Online</title>
</head>

<body>

    <div class="w3-container w3-teal">

        <h2>Forma de pagamento</h2>

    </div>

    <form class="w3-container" method="post" action="atividadeOnlineAction.php">

        <label class="w3-text-teal"><b>Nome do Cliente</b></label>
        <input class="w3-input w3-border w3-light-grey" name="txtNome" type="text">

        <label class="w3-text-teal"><b>Valor  da Compra</b></label>
        <input class="w3-input w3-border w3-light-grey" name="txtValorCompra" type="number">

        <label class="w3-text-teal"><b>Escolha a forma de Pagamento:</b></label>
        <select class="w3-input w3-border w3-light-grey"  name = "cmbPag">

        <option value="cartaoCredito">Cartão de Crédito</option>
        <option value="boleto">Boleto</option>
        <option value="deposito" selected>Depósito</option>

        </select>

        <br>

        <button class="w3-btn w3-blue-grey">Enviar</button>

    </form>

</body>

</html>
```


<hr>

Foi solicitado que, após o clique do envio, seja exibida ao usuário a mensagem, conforme demonstra a imagem a seguir:

![image](https://user-images.githubusercontent.com/98980485/186032725-0b989217-3371-4c5d-9d6c-919f3f04622b.png)

Vamos ajudar Carlos a desenvolver esta atividade!

<br>

**Dicas:**

* Você pode utilizar html e css para deixar agradável o seu site
* Utilize o exercício Você no Comando como base
 
<br>

**Competências estudadas nesta atividade:**

3.Desenvolver sistemas para internet utilizando persistência em banco de dados, interface com o usuário e programação em lado servidor.

<br>

**Habilidades:**

3.1 Codificar software em linguagem para web.

3.2. Utilizar banco de dados relacionais para persistência dos dados.

3.3. Utilizar interface baseada em navegador para interação com   usuário.
