<div>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/ruby/ruby-plain-wordmark.svg" height=100 width=100 />
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/rails/rails-plain-wordmark.svg" height=100 width=100 />
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bash/bash-plain.svg" height=100 width=100/>
          
</div>       
          

### Comandos realizados em aula.

### Vagrant: 
	 $ vagrant up  | Subir/ligar a máquina virtual 
	 $ vagrant ssh | Acessar a máquina virtual

### Localizar a pasta vagrant:
	$ cd.. / cd..  | Voltar para a pasta raiz
	$ cd Vagrant   | Acessar a pasta do vagrant
	$ rails _5.2_ new PROJETO | Criar um projeto Rails
	$ cd PROJETO   | Entrar no projeto Rails

### Criação de tabela via Scaffold:
	$ rails g scaffold City description:string code:integer image
### Interface de banco de dados:
	$ rails db
	$ rails dbconsole
	  .tables      | Ver tabelas
	  .quit        | Sair da interface

### Visualizar tasks em aberto:
	$ rails -T
	$ rails -T db
### Criar o banco: 
	$ rails db:migrate
	Subir o nosso projeto Rails:
	$ rails s -b 0.0.0.0
	$ rails s -b 0.0.0.0 -e production | Ambiente de produção
