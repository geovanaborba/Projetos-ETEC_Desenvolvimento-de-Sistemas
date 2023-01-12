## Agenda 15 - App para cadastro de produtos com notificações/alerta, caso haja campos em branco

### Descrição da atividade: 

Desenvolva um projeto no Kodular utilizando componente Notifier. 

Crie um projeto com uma tela para Cadastro de Produtos, a tela deve solicitar os dados básicos de um produto de sua escolha (codigo, nome, valor...). Utilize o componente Notifier para solicitar que o usuário preencha corretamente os campos caso os deixe vazios.

Importante: enviar prints do funcionamento do programa em um arquivo .pdf junto com o arquivo"aia" em uma pasta compactada.

<hr>

### Meu projeto: 

O usuário deve conseguir inserir dados para cadastro de produtos, sendo estes 1 – código, 2 – Nome do produto e 3 – valor do produto.
Após a inserção dos valores, ao clicar no botão enviar, ele é avisado caso haja algum campo em branco. Se não houver, é emitido a notificação perguntando se o aplicativo deve ser fechado.
Utilizei Horizontal Arrangement para alinhar os elementos label e text box para cada item do produto, além de um no botão cadastrar, para poder centralizá-lo.
Além disso, coloquei espaços para os elementos não ficarem muito grudados e atrapalhar a experiência do usuário.

![image](https://user-images.githubusercontent.com/98980485/212181124-efce9726-1e92-449b-a9f0-bbfb8ca3f667.png)

![image](https://user-images.githubusercontent.com/98980485/212181189-54295b90-c343-4a6e-8bdb-3725e266ed2b.png)


**Nas text box, defini os Inputs Types como:**

* Código como “1 - normal”, 
* Nome como “3 – nome” e 
* Valor como “5 – number”,

para apenas aceitar determinados valores.

**Obs.: Para o text box código, fiz com um show alert e para os outros 2, os defini com .Show Message Dialog, para utilizar os exemplos mostrados na apostila no mesmo projeto.**

![image](https://user-images.githubusercontent.com/98980485/212181456-99043a77-4330-4ea6-87b3-f46b26c441d2.png)

![image](https://user-images.githubusercontent.com/98980485/212181523-f8dea8ed-3989-49dd-abcb-ff3a36ee037e.png)

![image](https://user-images.githubusercontent.com/98980485/212181596-4a25f1de-9e9b-4912-82b8-1575799cf590.png)

![image](https://user-images.githubusercontent.com/98980485/212181667-46db934e-93c9-41fb-9951-a00d250ac5a6.png)

<br>

## * Blocks do Projeto: 

![image](https://user-images.githubusercontent.com/98980485/212181779-3c812112-1ba8-41e3-8b04-118586bf40a9.png)

![image](https://user-images.githubusercontent.com/98980485/212181838-39f34807-5e48-4143-9251-18020be846c7.png)
