# Sistema de Gerenciamento de Eventos
Este é um sistema de gerenciamento de eventos desenvolvido em Java para organizar e controlar informações sobre foliões, transportes e blocos durante festas e eventos. O sistema permite criar, visualizar e registrar informações sobre foliões, transportes e blocos, facilitando o gerenciamento eficiente dos recursos durante o evento.

## Funcionalidades
- Criar Folião: Permite criar um novo folião, fornecendo informações como CPF, RG, nome e idade. O sistema também permite associar um transporte ao folião.
- Criar Transporte: Permite criar um novo transporte, fornecendo informações como ID, nome, tipo, valor, capacidade e horários de saída, retorno e chegada. É possível associar um bloco ao transporte.
- Criar Bloco: Permite criar um novo bloco, fornecendo informações como ID, nome, local e horário de saída.
- Exibir Todas as Informações: Permite exibir todas as informações registradas no sistema, incluindo foliões, transportes e blocos.

## Estrutura do Projeto
O projeto está organizado em módulos e classes Java:

- Foliao.java: Define a classe Foliao, responsável por representar um folião e suas informações.
- Transporte.java: Define a classe Transporte, responsável por representar um transporte e suas informações, além de permitir a associação com um bloco.
- Bloco.java: Define a classe Bloco, responsável por representar um bloco e suas informações.
- Processo.java: Define a classe Processo, responsável por controlar o fluxo do sistema, incluindo a interação com o usuário através do console e as operações principais do sistema.
- MyFirstProjectJava.java: Define a classe MyFirstProjectJava, que contém o método main e serve como ponto de entrada do programa.

## Como Executar
Para executar o sistema, siga estas etapas:

1. Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
2. Baixe ou clone o repositório deste projeto em sua máquina local.
3. Navegue até o diretório do projeto via terminal.
4. Compile os arquivos Java executando o seguinte comando: \
`javac *.java`
5. Após compilar com sucesso, execute o arquivo MyFirstProjectJava.class com o seguinte comando:\
`java MyFirstProjectJava`\
6. O sistema será iniciado e você poderá interagir com ele através do console, seguindo as instruções exibidas.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request para melhorar este projeto.

## Licença
Este projeto está licenciado sob a MIT License.
