#include <iostream> //Biblioteca padrão de I/O
#include <string.h> //Biblioteca para o uso de strings

using namespace std; //Retiramos a abreviação do std:: antes de cada linha do código

int escolha;
struct Cliente{
	string nome;
	string email;
	string endereco;
	int idade;
	double cpf;
	
};

int main(void){
	setlocale(LC_ALL, ""); //Vai garantir que caracteres como “ç” e acentuação sejam exibidos normalmente em nosso programa, utilizada pela biblioteca locale.h
	
	Cliente a, b, c, d, e;
	
	cout << "        SENAI TELECOM E COMUNICAÇÕES LTDA" << endl;
	cout << "\nOlá, seja bem vindo ao cadastro para instalação de internet!" << endl;
    cout << "Para isso, precisamos de algumas informacoes pessoais:" << endl;
    
    cout << "\n- Por favor, digite seu nome completo: " << endl;
    getline (cin, a.nome);
    cout << "\n- Por favor, digite seu email: " << endl;
    getline (cin, a.email);
    cout << "\n- Por favor, digite seu endereco completo: " << endl;
    getline (cin, a.endereco);
    cout << "\n- Ótimo, agora digite sua idade: " << endl;
    cin >> a.idade;
    cout << "\n- Para finalizar, preciso do numero do seu CPF: " << endl;
    cin >> a.cpf; 

	cout << "\n- Por favor, confirme os dados digitados anteriormente: " << endl;
	cout << "1. Nome: " << a.nome << endl;
	cout << "2. Email: " << a.email << endl;
	cout << "3. Endereço: " << a.endereco << endl;
	cout << "4. Idade: " << a.idade << endl;
	cout << "5. CPF: " << a.cpf << endl;
    
    cout << "\nTodos os dados estão corretos?" << endl;
    cout << "1. Sim" << endl;
    cout << "2. Não" << endl;
    cin >> escolha;
    
    if (escolha == 1 && a.idade >= 18){
    	cout << "Cadastro enviado com sucesso, em até 2 horas nossa equipe o retorna! Obrigado." << endl;
}	else if(escolha == 2 || a.idade < 18){
	    cout << "Que pena, você não tem idade suficiente ou houve divergências nos dados. Reinicie o processo e tente novamente, se não, ligue para nossa central: 4002-8922" << endl;
}
		
}

