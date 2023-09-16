## Agenda 5 - Permissões

### Descrição da atividade: 

Altere o aplicativo “Permissao” excluindo a permissão de acesso para a câmera do dispositivo. E inclua uma permissão para o aplicativo acessar o GPS. Salve seu projeto e envie para seu professor.

<hr>

### Meu projeto: 

Tentei fazer as alterações, mas parece que meu aplicativo não funciona como deveria de acordo com os passos da apostila. A começar pelo pedido de permissão. No vídeo da aula assíncrona e nos tutoriais da apostila, aparecia o nome do aplicativo criado (Permissão ou Permissões, por exemplo, “Permitir que o app Permissões...”),  invés de “Companion” como aparece no meu. Mesmo seguindo exatamente igual os blocks da atividade com a permissão da câmera, já estava acontecendo isso. 

  
![image](https://github.com/geovanaborba/Projetos-ETEC_Desenvolvimento-de-Sistemas/assets/98980485/9d29ad9e-5a13-4a14-b204-432fd02179c8)

<br>

Nos prints a seguir, havia usado a permissão “LOCATION” e ela não funcionou adequadamente. Escolhi “Durante o uso do app”, porém a lbl_Permissao não altera para “GPS LIBERADO”. Ela simplesmente fica vazia:

![image](https://github.com/geovanaborba/Projetos-ETEC_Desenvolvimento-de-Sistemas/assets/98980485/42013717-268a-414c-86e9-a500556bb4aa)

<br>

Quando clicado no botão “Localizar”, a label se altera para “GPS BLOQUEADO”, porém nas autorizações do app, constava como permitido: 

![image](https://github.com/geovanaborba/Projetos-ETEC_Desenvolvimento-de-Sistemas/assets/98980485/2a2b0cfb-338e-4565-8224-2d72de1cfae4)

![image](https://github.com/geovanaborba/Projetos-ETEC_Desenvolvimento-de-Sistemas/assets/98980485/6a02b79e-accd-4083-bb06-bdfe1b3a0bfb)

<br>

**Então alterei a permissão para “ACCESS_COARSE_LOCATION” e parece que funcionou com isso. Segue prints:**

![image](https://github.com/geovanaborba/Projetos-ETEC_Desenvolvimento-de-Sistemas/assets/98980485/3a9c3c1e-38ed-4eb8-a0b9-44c2d50756ca)

<br>

![image](https://github.com/geovanaborba/Projetos-ETEC_Desenvolvimento-de-Sistemas/assets/98980485/9542f1d5-a5eb-4848-84fc-4179e97951a5)

<br>
<br>

![image](https://github.com/geovanaborba/Projetos-ETEC_Desenvolvimento-de-Sistemas/assets/98980485/12e01e5d-5257-4f45-b622-9894554cea37)
