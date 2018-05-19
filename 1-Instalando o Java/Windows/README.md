Aqui serão descritos passos para instalação e configuração do Java no Windows10, para outras versões do Windows
alguns passos podem ser levmente diferentes.

1. Antes de baixar e instalar o Java precisamos saber a arquitetura do processador, para isso abrimos o cmd 
e executamos o comando: "wmic os get osarchitecture" (1.png)

2. Agora acessando o link: "http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html", 
então baixamos o JDK, ATENÇÃO devemos baixar o JDK (Java Development Kit) e não o JRE (Java Runtime Environment). 
A diferença entre os dois é que o JRE vem apenas com o que é necessário para executar um programa escrito em Java,
já o JDK vem com todas as ferramentas para desenvolver um programa em Java, por sinal o JRE faz parte do JDK. 
(2.png - 3.png)

3. Execute o instalador e proceda com a instalação...

4. Agora temos que configurar as variáveis do sistema, abrimos o Painel de Control em Sistema e Segurança 
selecionamos Sistema (4.png). No canto esquerdo vamos em Configurações Avançadas do Sistema (5.png),
variáveis de ambiente (6.png). Agora temos que conferir em qual pasta o JDK foi instalado, por padrão ele
é instalado em "C:\Arquivos do Programas\Java\jdk-<versão>" (7.png).

5. Criamos uma nova variável de sistema com o nome; "JAVA_HOME" e com o valor sendo o caminho para a pasta de instalação
do JDK (8.png).

6. Temos também que editar a variável "Path" (9.png), nela colocamos o caminho para os binários do JDK, no caso:
"C:\Arquivos do Programas\Java\jdk-<versão>\bin", como isso é o valor da variável JAVA_HOME mais \bin podemos
configurá-la da seguinte forma "%JAVA_HOME%\bin" (10.png).

7. Por fim testamos o Java com o comando "java -version".

Caso ocorra algum problema envie o erro no grupo de programação no WhatsApp com o retorno dos seguintes comandos:
-echo %JAVA_HOME%
-echo %Path%
-java -version
