<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Info Usuário</title>
</head>

<body>

    <?php
    if (!isset($_SESSION)) {
        session_start();
    }
    require_once '../Model/Usuario.php';
    require_once '../Controller/UsuarioController.php';
    require_once '../Controller/FormacaoAcadController.php';
    require_once '../Model/FormacaoAcad.php';
    require_once '../Model/ExperienciaProfissional.php';
    require_once '../Controller/ExperienciaProfissionalController.php';
    require_once '../Model/Administrador.php';
    require_once '../Controller/AdministradorController.php';
    ?>


    <form action="../Controller/navegacao.php" method="POST">
        <button name="btnVoltarLista" class="w3-button w3-cyan w3-round-large w3-display-topleft">
            <i class="fa fa-arrow-circle-left w3-text-white w3-large w3-button w3-xxlarge"></i>
        </button>
    </form>


    <div class="w3-padding-128 w3-content w3-text-grey">

        <div>
            <header class="w3-container w3-padding-32 w3-center ">
                <h1 class="w3-text-white w3-panel w3-cyan w3-round-large">Visualização de Cadastro</h1>
            </header>

            <div class="w3-padding-128 w3-content w3-text-grey">
                <div class="w3-container">
                    <table class="w3-table-all w3-centered">
                        <thead>
                            <tr class="w3-centered w3-blue">
                                <th>ID</th>
                                <th>Nome</th>
                                <th>CPF</th>
                                <th>E-mail</th>
                                <th>Data Nsc.</th>
                            </tr>
                        </thead>

                        <?php

                        $u = new UsuarioController();
                        $r = $u->gerarLista();
                        if ($r != null) {
                            while ($row = $r->fetch_object()) {
                                echo '<tr>';
                                echo '<td style="width: 1%;">' . $row->idusuario . '</td>';
                                echo '<td style="width: 20%;">' . $row->nome . '</td>';
                                echo '<td style="width: 20%;">' . $row->cpf . '</td>';
                                echo '<td style="width: 20%;">' . $row->email . '</td>';
                                echo '<td style="width: 20%;">' . $row->dataNascimento . '</td>';
                                echo '</tr>';
                            }
                        }
                        ?>
                    </table>
                </div>
            </div>

            <br>
            <br>
            <br>
            <br>

            <div class="w3-container w3-padding-32 w3-center ">
                <h2 class="w3-text-white w3-panel w3-cyan w3-round-large"> Formação Acadêmica</h2>
            </div>
            <div class="w3-padding-128 w3-content w3-text-grey">
                <div class="w3-container">
                    <table class="w3-table-all w3-centered">
                        <thead>
                            <tr class="w3-center w3-blue">
                                <th>ID</th>
                                <th>Início</th>
                                <th>Fim</th>
                                <th>Descrição</th>
                            </tr>
                        </thead>

                        <?php
                        $fCon = new FormacaoAcadController();
                        $r = $fCon->gerarLista($idusuario);
                        if ($r != null) {
                            while ($row = $r->fetch_object()) {
                                echo '<tr>';
                                echo '<td style="width: 1%;">' . $row->idusuario . '</td>';
                                echo '<td style="width: 20%;">' . $row->inicio . '</td>';
                                echo '<td style="width: 20%;">' . $row->fim . '</td>';
                                echo '<td style="width: 40%;">' . $row->descricao . '</td>';
                                echo '</tr>';
                            }
                        }
                        ?>
                    </table>
                </div>
            </div>
        </div>
        <br>
        <br>
        <br>
        <br>

        <div class="w3-container">

            <div class="w3-container w3-padding-32 w3-center ">
                <h2 class="w3-text-white w3-panel w3-cyan w3-round-large"> Experiencia Profissional</h2>
            </div>


            <table class="w3-table-all w3-centered">
                <thead>
                    <tr class="w3-center w3-blue">
                        <th>ID</th>
                        <th>Início</th>
                        <th>Fim</th>
                        <th>Empresa</th>
                        <th>Descrição</th>
                    </tr>
                </thead>

                <?php
                $expP = new ExperienciaProfissionalController();
                $r = $expP->gerarLista($idusuario);
                if ($r != null) {
                    while ($row = $r->fetch_object()) {
                        echo '<tr>';
                        echo '<td style="width: 1%;">' . $row->idusuario . '</td>';
                        echo '<td style="width: 20%;">' . $row->inicio . '</td>';
                        echo '<td style="width: 20%;">' . $row->fim . '</td>';
                        echo '<td style="width: 30%;">' . $row->empresa . '</td>';
                        echo '<td style="width: 30%;">' . $row->descricao . '</td>';
                        echo '</tr>';
                    }
                }
                ?>
            </table>
        </div>
    </div>
    <br>
    <br>
    <br>
    <br>
</body>

</html>