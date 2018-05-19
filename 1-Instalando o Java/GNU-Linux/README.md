O procedimento para cada distribuição GNU/Linux é um pouco diferente, mas é basicamente utilizar o gerenciador de
pacotes para instalar o Java. Listarei os comandos para as principais distribuições:

1. Logar como root no terminal: "sudo -i" ou "su -"

2. <br>
-Distribuições baseadas no Debian: "apt-get install default-jre default-jdk" <br>
-Distribuições baseadas no Ubuntu (apesar do Ubuntu ser baseado no Debian): "apt-get install openjdk-8-jre openjdk-8-jdk" <br>
-Distribuições baseadas no Arch: "pacman -S jre10-openjdk-headless jre10-openjdk jdk10-openjdk openjdk10-doc openjdk10-src" <br>
-Distribuições baseadas no Gentoo: "emerge --ask virtual/jre virtual/jdk"

3. Teste com o comando "java -version"

E é só isso mesmo. Mas para não ficar vazio desse jeito vou deixar um tutorial de como instalar o Linux Mint,
uma distribuição GNU/Linux baseada no Ubuntu:

1. Entre no site official do Linux Mint e na seção de downloads escolha um dos mirrors para baixar a imagem do sistema:
"https://linuxmint.com/download.php" (1.png). Escolha uma interface gráfica (Cinnamon, Mate, XFCE ou KDE), eu irei usar
o Cinnamon, para quem tem um computador menos potente escolha o XFCE, para quem prefere aparência escolha o KDE.

2. Precisamos agora instalar um programa que grave a imagem do sistema em um pendrive, vamos usar este aqui: 
"http://www.isotousb.com", a instalação dele é genérica (next>next>install) e parece não conter vírus ou
software indesejado.

3. Agora abrimos o ISO to USB, na caixa de  diálogo selecione a iso do linux mint e  pendrive em que você quer gravar a iso.
Não há a necessidade de mudar o sistema de arquivos ou o nome do dispositivo. Não se esqueça de marcar a opção "Bootable".
Isso irá apagar os dados do seu pendrive!

4. Faça um backup do seu HD ou tenha um HD vazio.

5. Com o pendrive plugado reinicie o computador. Entre no menu de boot, isso pode variar de acordo com a sua placa-mãe,
geralmente você deve clicar <F7>, <F8> ou <F12> durante a inicialização, mas pode ser que a sua placa use outra tecla,
então faça uma pesquisa para descobrir qual ela usa. No menu de boot escolha o pendrive. Em alguns casos a placa não tem 
um menu de boot, neste caso você deve alterar a ordem de boot deixando o pendrive em primeiro lugar.

6. O sistema sobe diretamente em modo live, então você pode ir testando e explorando o que há nele sem nem precisar mexer no
HD, pois todo o sistema estará rodando na memória RAM (2.png).

7. Para instalar clique duas vezes no ícone "Install Linux Mint".

8. O primeiro passo é escolher a liguagem do sistema. Depois você deve escolher se quer instalar softwares de media, eu
recomendo que sim.

9. O próximo passo é o tipo de instalação, deixe na opção básica mesmo (Erase disk and install Linux Mint), clicando em 
"install now" uma caixa de diálogo irá se abrir te informando as alterações no disco. Antenção, isso irá formatar o seu
HD!

10. Seguindo a diante, o próximo passo é configurar data e hora, apenas selecione a região do mapa onde você mora. Em
seguida configure o layout do teclado.

11. Agora neste passo você criará o usuário principal do sistema, não há segredos nesse passo mas note, na hora logar
você usará o nickname e não o nome.

12. Por fim o sistema será instalado. Acabando a instalação é só reiniciar o computador e pronto!
