#include <iostream> //Biblioteca padr�o de I/O
#include <string.h> //Biblioteca para o uso de strings

using namespace std; //Retiramos a abrevia��o do std:: antes de cada linha do c�digo

int escolha;
struct Cliente{
	string nome;
	string email;
	string endereco;
	int idade;
	double cpf;
	
};

int main(void){
	setlocale(LC_ALL, ""); //Vai garantir que caracteres como �� e acentua��o sejam exibidos normalmente em nosso programa, utilizada pela biblioteca locale.h
	
	Cliente a, b, c, d, e;
	
	cout << "        SENAI TELECOM E COMUNICA��ES LTDA" << endl;
	cout << "\nOl�, seja bem vindo ao cadastro para instala��o de internet!" << endl;
    cout << "Para isso, precisamos de algumas informacoes pessoais:" << endl;
    
    cout << "\n- Por favor, digite seu nome completo: " << endl;
    getline (cin, a.nome);
    cout << "\n- Por favor, digite seu email: " << endl;
    getline (cin, a.email);
    cout << "\n- Por favor, digite seu endereco completo: " << endl;
    getline (cin, a.endereco);
    cout << "\n- �timo, agora digite sua idade: " << endl;
    cin >> a.idade;
    cout << "\n- Para finalizar, preciso do numero do seu CPF: " << endl;
    cin >> a.cpf; 

	cout << "\n- Por favor, confirme os dados digitados anteriormente: " << endl;
	cout << "1. Nome: " << a.nome << endl;
	cout << "2. Email: " << a.email << endl;
	cout << "3. Endere�o: " << a.endereco << endl;
	cout << "4. Idade: " << a.idade << endl;
	cout << "5. CPF: " << a.cpf << endl;
    
    cout << "\nTodos os dados est�o corretos?" << endl;
    cout << "1. Sim" << endl;
    cout << "2. N�o" << endl;
    cin >> escolha;
    
    if (escolha == 1 && a.idade >= 18){
    	cout << "Cadastro enviado com sucesso, em at� 2 horas nossa equipe o retorna! Obrigado." << endl;
}	else if(escolha == 2 || a.idade < 18){
	    cout << "Que pena, voc� n�o tem idade suficiente ou houve diverg�ncias nos dados. Reinicie o processo e tente novamente, se n�o, ligue para nossa central: 4002-8922" << endl;
}
		
}

