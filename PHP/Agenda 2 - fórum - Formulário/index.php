<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Formulário</title>
        <link rel="stylesheet" href="./css/styles.css">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">

    </head>

    <body>
        <header>
            <h1>Formulário</h1>
        </header>
    
        <main>
            <form method="post" action="action.php">
                <section class="inputs-container">

                    <input id="nome" type="text" name="nome" placeholder="Insira o seu nome">

                    <div class="birthday-container">
                        <input id="ano" type="text" name="ano" placeholder="Insira seu ano de nascimento">
                        <i class="fa-solid fa-cake-candles"></i>

                    </div>
                </section>

                
                <button id="btn-submit">Enviar</button>

    
                <footer>
                    <hr>
                    <span>&copy Geovana de Avila Borba - 2022 <br> Etec - Desenvolvimento de Sistemas - Módulo II
                    </span>

                    <section class="links-container">
                    
                        <aside>
                            <a href="https://github.com/geovanaborba"><i class="fa-brands fa-github github"></i></a>
                            <a href="https://www.linkedin.com/in/geovanaborba/"><i class="fab fa-linkedin linkedin"></i></a>
                            <a href="https://www.instagram.com/astarte.drawings/"><i class="fa-brands fa-instagram instagram"></i></a>
                        </aside>
    
                    </section>
                </footer>
                
            </form>
        </main>

        <script src="https://kit.fontawesome.com/5f56dfe06a.js" crossorigin="anonymous"></script>
    </body>


</html>
